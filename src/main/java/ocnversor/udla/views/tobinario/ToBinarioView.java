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
import ocnversor.udla.views.MainLayout;

@PageTitle("ToBinario")
@Route(value = "toBinario", layout = MainLayout.class)
@Uses(Icon.class)
public class ToBinarioView extends Composite<VerticalLayout> {

    public ToBinarioView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        H1 h1 = new H1();
        H3 h3 = new H3();
        TextField textField = new TextField();
        Button buttonPrimary = new Button();
        TextField textField2 = new TextField();
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
        textField.setLabel("Decimal");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, textField);
        textField.setWidth("700px");
        buttonPrimary.setText("Convertir");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, buttonPrimary);
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        textField2.setLabel("Binario");
        getContent().setAlignSelf(FlexComponent.Alignment.CENTER, textField2);
        textField2.setWidth("700px");
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        getContent().add(layoutRow);
        layoutRow.add(h1);
        getContent().add(h3);
        getContent().add(textField);
        getContent().add(buttonPrimary);
        getContent().add(textField2);
        getContent().add(layoutColumn2);
    }
}
