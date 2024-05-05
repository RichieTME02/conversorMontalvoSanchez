package ocnversor.udla.views.tobinario;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import ocnversor.udla.metodos.decTObin;
import ocnversor.udla.views.MainLayout;


@PageTitle("ToBinario")
@Route(value = "toBinario", layout = MainLayout.class)
@Uses(Icon.class)
public class ToBinarioView extends Composite<VerticalLayout> {

    public ToBinarioView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        H1 h1 = new H1();
        H3 h3 = new H3();
        TextField decimalField = new TextField();
        Button buttonPrimary = new Button();
        TextField binField = new TextField();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        layoutRow.setAlignItems(Alignment.CENTER);
        layoutRow.setJustifyContentMode(JustifyContentMode.CENTER);
        h1.setText("Convertir Decimal a Binario");
        h1.setWidth("max-content");
        h3.setText("INGRESE EL DECIMAL A CONVERTIR");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, h3);
        h3.setWidth("max-content");
        decimalField.setLabel("Decimal");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, decimalField);
        decimalField.setWidth("700px");
        buttonPrimary.setText("Convertir");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, buttonPrimary);
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        binField.setLabel("Binario");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, binField);
        binField.setWidth("700px");
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        getContent().add(layoutRow);
        layoutRow.add(h1);
        getContent().add(h3);
        getContent().add(decimalField);
        getContent().add(buttonPrimary);
        getContent().add(binField);
        getContent().add(layoutColumn2);

        // Agregar listeners a los campos
        decimalField.addValueChangeListener(event -> {
            String value = event.getValue();
            if (!value.isEmpty()) {
                int decimal = Integer.parseInt(value);
                String binary = decTObin.decimalToBinary(decimal);
                binField.setValue(binary);
            }
        });

        binField.addValueChangeListener(event -> {
            String value = event.getValue();
            if (!value.isEmpty()) {
                int decimal = decTObin.binaryToDecimal(value);
                decimalField.setValue(String.valueOf(decimal));
            }
        });

        buttonPrimary.addClickListener(event -> {
            String value = decimalField.getValue();
            if (!value.isEmpty()) {
                int decimal = Integer.parseInt(value);
                String binary = decTObin.decimalToBinary(decimal);
                binField.setValue(binary);
            } else {
                value = binField.getValue();
                if (!value.isEmpty()) {
                    int decimal = decTObin.binaryToDecimal(value);
                    decimalField.setValue(String.valueOf(decimal));
                }
            }
        });
    }
}
