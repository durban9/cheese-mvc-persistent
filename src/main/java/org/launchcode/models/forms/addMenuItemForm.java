package org.launchcode.models.forms;

import org.launchcode.models.Cheese;
import org.launchcode.models.Menu;

import javax.validation.constraints.NotNull;

public class addMenuItemForm {

    @NotNull
    private int MenuId;

    @NotNull
    private int cheeseId;

    private Iterable<Cheese> cheese;

    private Menu menu;

    public addMenuItemForm(){
    }

    public addMenuItemForm(Iterable<Cheese> cheeses, Menu menu){
        this.cheese=cheeses;
        this.menu=menu;
    }

    public int getMenuId() {
        return MenuId;
    }

    public void setMenuId(int menuId) {
        this.MenuId = menuId;
    }

    public int getCheeseId() {
        return cheeseId;
    }

    public void setCheeseId(int cheeseId) {
        this.cheeseId = cheeseId;
    }

    public Iterable<Cheese> getCheese() {
        return cheese;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void setCheese(Iterable<Cheese> cheese) {
        this.cheese = cheese;
    }


}
