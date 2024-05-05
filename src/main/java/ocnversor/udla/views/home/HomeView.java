package ocnversor.udla.views.home;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import ocnversor.udla.views.MainLayout;
import ocnversor.udla.views.tobinario.ToBinarioView;
import ocnversor.udla.views.tohex.ToHexView;
import ocnversor.udla.views.toipv4.ToIPv4View;
import ocnversor.udla.views.toipv6.ToIPv6View;

@PageTitle("Home")
@Route(value = "", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@Uses(Icon.class)
public class HomeView extends Composite<VerticalLayout> {

    public HomeView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        H1 h1 = new H1();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        H2 h2 = new H2();
        H2 h22 = new H2();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        Button ir = new Button();
        Button ir2 = new Button();
        HorizontalLayout layoutRow4 = new HorizontalLayout();
        H2 h23 = new H2();
        H2 h24 = new H2();
        HorizontalLayout layoutRow5 = new HorizontalLayout();
        Button ir3 = new Button();
        Button ir4 = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        layoutRow.setAlignItems(Alignment.CENTER);
        layoutRow.setJustifyContentMode(JustifyContentMode.CENTER);
        h1.setText("Bienvenidos al Conversor");
        layoutRow.setAlignSelf(FlexComponent.Alignment.CENTER, h1);
        h1.setWidth("max-content");
        layoutColumn2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("100%");
        layoutColumn2.getStyle().set("flex-grow", "1");
        layoutRow2.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.XSMALL);
        layoutRow2.setWidth("100%");
        layoutRow2.setHeight("35px");
        layoutRow2.setAlignItems(Alignment.CENTER);
        layoutRow2.setJustifyContentMode(JustifyContentMode.CENTER);
        h2.setText("Ir al conversor de Binarios");
        h2.setWidth("600px");
        h2.setHeight("35px");
        h22.setText("Ir al conversor de Hexadecimal");
        layoutRow2.setAlignSelf(FlexComponent.Alignment.START, h22);
        h22.setWidth("600px");
        layoutRow3.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.setHeight("35px");
        layoutRow3.setAlignItems(Alignment.CENTER);
        layoutRow3.setJustifyContentMode(JustifyContentMode.CENTER);
        ir.setText("Ir");
        ir.setWidth("600px");
        ir.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        ir2.setText("Ir");
        ir2.setWidth("600px");
        ir2.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        layoutRow4.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow4);
        layoutRow4.addClassName(Gap.MEDIUM);
        layoutRow4.setWidth("100%");
        layoutRow4.setHeight("35px");
        layoutRow4.setAlignItems(Alignment.CENTER);
        layoutRow4.setJustifyContentMode(JustifyContentMode.CENTER);
        h23.setText("Ir al conversor de IPv4");
        h23.setWidth("600px");
        h23.setHeight("35px");
        h24.setText("Ir al conversor de IPv6");
        layoutRow4.setAlignSelf(FlexComponent.Alignment.START, h24);
        h24.setWidth("600px");
        layoutRow5.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow5);
        layoutRow5.addClassName(Gap.MEDIUM);
        layoutRow5.setWidth("100%");
        layoutRow5.setHeight("35px");
        layoutRow5.setAlignItems(Alignment.CENTER);
        layoutRow5.setJustifyContentMode(JustifyContentMode.CENTER);
        ir3.setText("Ir");
        ir3.setWidth("600px");
        ir3.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        ir4.setText("Ir");
        ir4.setWidth("600px");
        ir4.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        getContent().add(layoutRow);
        layoutRow.add(h1);
        getContent().add(layoutColumn2);
        layoutColumn2.add(layoutRow2);
        layoutRow2.add(h2);
        layoutRow2.add(h22);
        layoutColumn2.add(layoutRow3);
        layoutRow3.add(ir);
        layoutRow3.add(ir2);
        layoutColumn2.add(layoutRow4);
        layoutRow4.add(h23);
        layoutRow4.add(h24);
        layoutColumn2.add(layoutRow5);
        layoutRow5.add(ir3);
        layoutRow5.add(ir4);

        ir.addClickListener(event -> {
            UI.getCurrent().navigate(ToBinarioView.class);
        });

        ir2.addClickListener(event -> {
            UI.getCurrent().navigate(ToHexView.class);
        });

        ir3.addClickListener(event -> {
            UI.getCurrent().navigate(ToIPv4View.class);
        });

        ir4.addClickListener(event -> {
            UI.getCurrent().navigate(ToIPv6View.class);
        });
    }
}
