package ocnversor.udla.views.toipv4;

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
import ocnversor.udla.metodos.conIPv4;

@PageTitle("ToIPv4")
@Route(value = "toIPv4", layout = MainLayout.class)
@Uses(Icon.class)
public class ToIPv4View extends Composite<VerticalLayout> {

    public ToIPv4View() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        H1 h1 = new H1();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        H3 h3 = new H3();
        TextField binariofield = new TextField();
        Button buttonConvertir = new Button();
        TextField ip4field = new TextField();

        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        layoutRow.setAlignItems(Alignment.CENTER);
        layoutRow.setJustifyContentMode(JustifyContentMode.CENTER);
        h1.setText("Convertir Binario a IPv4");
        h1.setWidth("max-content");
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        h3.setText("INGRESE EL BINARIO A CONVERTIR");
        layoutColumn2.setAlignSelf(FlexComponent.Alignment.CENTER, h3);
        h3.setWidth("max-content");
        binariofield.setLabel("Binario");
        layoutColumn2.setAlignSelf(FlexComponent.Alignment.CENTER, binariofield);
        binariofield.setWidth("700px");
        buttonConvertir.setText("Convertir");
        layoutColumn2.setAlignSelf(FlexComponent.Alignment.CENTER, buttonConvertir);
        buttonConvertir.setWidth("min-content");
        buttonConvertir.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        ip4field.setLabel("IPv4");
        layoutColumn2.setAlignSelf(FlexComponent.Alignment.CENTER, ip4field);
        ip4field.setWidth("700px");
        getContent().add(layoutRow);
        layoutRow.add(h1);
        getContent().add(layoutColumn2);
        layoutColumn2.add(h3);
        layoutColumn2.add(binariofield);
        layoutColumn2.add(buttonConvertir);
        layoutColumn2.add(ip4field);

        // Inicialización de componentes
        TextField binarioField = new TextField();
        TextField ip4Field = new TextField();

        binariofield.addValueChangeListener(event -> {
            String binary = event.getValue();
            String ipv4 = conIPv4.binaryToIpv4(binary);
            ip4field.setValue(ipv4);
        });

        ip4field.addValueChangeListener(event -> {
            String ipv4 = event.getValue();
            String binary = conIPv4.ipv4ToBinary(ipv4);
            binariofield.setValue(binary);
        });

        buttonConvertir.addClickListener(event -> {
            String binary = binariofield.getValue();
            String ipv4 = conIPv4.binaryToIpv4(binary);
            ip4field.setValue(ipv4);
        });

        getContent().add(layoutRow);
        layoutRow.add(h1);
        getContent().add(layoutColumn2);
        layoutColumn2.add(h3);
        layoutColumn2.add(binariofield);
        layoutColumn2.add(buttonConvertir);
        layoutColumn2.add(ip4field);
    }
}
