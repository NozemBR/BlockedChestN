package me.nozembr.events;



import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.*;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.Chest;


public class baumanager implements Listener {


    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (event.getClick().isShiftClick()) {
            if(event.getClickedInventory() == null) return;
            final Player p = (Player) event.getWhoClicked();
            if (event.getClickedInventory().getType().equals(InventoryType.PLAYER)) {
                // clicado com shift
                ItemStack clickedOn = event.getCurrentItem();
                if (event.getCurrentItem() != null) {
                    if (clickedOn != null && (clickedOn.getType() == Material.DIAMOND_SWORD)) {
                        event.setCancelled(true);
                        p.closeInventory();
                    }
                    if (clickedOn != null && (clickedOn.getType() == Material.DIAMOND_HELMET)) {
                        event.setCancelled(true);
                        p.closeInventory();

                    }
                    if (clickedOn != null && (clickedOn.getType() == Material.DIAMOND_CHESTPLATE)) {
                        event.setCancelled(true);
                        p.closeInventory();
                    }
                    if (clickedOn != null && (clickedOn.getType() == Material.DIAMOND_LEGGINGS)) {
                        event.setCancelled(true);
                        p.closeInventory();
                    }
                    if (clickedOn != null && (clickedOn.getType() == Material.DIAMOND_BOOTS)) {
                        event.setCancelled(true);
                        p.closeInventory();
                    }
                    if (clickedOn != null && (clickedOn.getType() == Material.ENDER_PEARL)) {
                        event.setCancelled(true);
                        p.closeInventory();
                    }
                    if (clickedOn != null && (clickedOn.getType() == Material.BOW)) {
                        event.setCancelled(true);
                        p.closeInventory();
                    }
                    if (clickedOn != null && (clickedOn.getType() == Material.DIAMOND_AXE)) {
                        event.setCancelled(true);
                        p.closeInventory();
                    }
                    if (clickedOn != null && (clickedOn.getType() == Material.STICK)) {
                        event.setCancelled(true);
                        p.closeInventory();
                    }
                    if (clickedOn != null && (clickedOn.getType() == Material.ENDER_CHEST)) {
                        event.setCancelled(true);
                        p.closeInventory();

                    }
                    if (event.getCurrentItem() != null) {
                        if (clickedOn != null && (clickedOn.getType() == Material.BLAZE_ROD)) {
                            event.setCancelled(true);
                            p.closeInventory();
                        }
                        if (clickedOn != null && (clickedOn.getType() == Material.ENCHANTED_BOOK)) {
                            event.setCancelled(true);
                            p.closeInventory();
                        }
                    }
                }
            }
        }
        if (event.getClick() == ClickType.NUMBER_KEY) {
            if (event.getClickedInventory().getType().equals(InventoryType.CHEST)) {
                // clicado com TECLADO
                ItemStack clickedOn = event.getCurrentItem();
                if (event.getCurrentItem() != null) {
                    if (clickedOn != null && (clickedOn.getType() == Material.ENDER_CHEST)) {
                        event.setCancelled(true);
                    }
                }
            }
        }
        if (event.getClick().isRightClick()) {
            ;
            // clicado com MOUSE
            if(event.getClickedInventory() == null) return;
            if(event.getCurrentItem() == null) return;
            ItemStack clickedOn = event.getCurrentItem();
            final Player p = (Player) event.getWhoClicked();
            if (event.getClickedInventory().getType().equals(InventoryType.PLAYER)) {
                if (clickedOn != null && (clickedOn.getType() == Material.BLAZE_ROD)) {
                    event.setCancelled(true);
                    p.closeInventory();
                }

                if (clickedOn != null && (clickedOn.getType() == Material.ENCHANTED_BOOK)) {
                    event.setCancelled(true);
                    p.closeInventory();
                }
                if (clickedOn != null && (clickedOn.getType() == Material.DIAMOND_HELMET)) {
                    event.setCancelled(true);
                    p.closeInventory();
                }
                if (clickedOn != null && (clickedOn.getType() == Material.DIAMOND_CHESTPLATE)) {
                    event.setCancelled(true);
                    p.closeInventory();
                }
                if (clickedOn != null && (clickedOn.getType() == Material.DIAMOND_LEGGINGS)) {
                    event.setCancelled(true);
                    p.closeInventory();
                }
                if (clickedOn != null && (clickedOn.getType() == Material.DIAMOND_BOOTS)) {
                    event.setCancelled(true);
                    p.closeInventory();
                }
                if (clickedOn != null && (clickedOn.getType() == Material.DIAMOND_SWORD)) {
                    event.setCancelled(true);
                    p.closeInventory();
                }
                if (clickedOn != null && (clickedOn.getType() == Material.ENDER_PEARL)) {
                    event.setCancelled(true);
                    p.closeInventory();
                }
                if (clickedOn != null && (clickedOn.getType() == Material.BOW)) {
                    event.setCancelled(true);
                    p.closeInventory();
                }
                if (clickedOn != null && (clickedOn.getType() == Material.STICK)) {
                    event.setCancelled(true);
                    p.closeInventory();
                }
                if (clickedOn != null && (clickedOn.getType() == Material.DIAMOND_AXE)) {
                    event.setCancelled(true);
                    p.closeInventory();
                }
            }
        }
        ItemStack clickedOn = event.getCurrentItem();
        if (event.getClick().isLeftClick()) {
            // clicado com mouse esquerdo
            if (event.getClickedInventory() == null) return;
            if (event.getCurrentItem() == null) return;
            final Player p = (Player) event.getWhoClicked();
            if (event.getClickedInventory().getType().equals(InventoryType.PLAYER)) {
                if (clickedOn != null && (clickedOn.getType() == Material.BLAZE_ROD)) {
                    event.setCancelled(true);
                    p.closeInventory();
                }

                if (clickedOn != null && (clickedOn.getType() == Material.ENCHANTED_BOOK)) {
                    event.setCancelled(true);
                    p.closeInventory();
                }
                if (clickedOn != null && (clickedOn.getType() == Material.DIAMOND_HELMET)) {
                    event.setCancelled(true);
                    p.closeInventory();
                }
                if (clickedOn != null && (clickedOn.getType() == Material.DIAMOND_CHESTPLATE)) {
                    event.setCancelled(true);
                    p.closeInventory();
                }
                if (clickedOn != null && (clickedOn.getType() == Material.DIAMOND_LEGGINGS)) {
                    event.setCancelled(true);
                    p.closeInventory();
                }
                if (clickedOn != null && (clickedOn.getType() == Material.DIAMOND_BOOTS)) {
                    event.setCancelled(true);
                    p.closeInventory();
                }
                if (clickedOn != null && (clickedOn.getType() == Material.DIAMOND_SWORD)) {
                    event.setCancelled(true);
                    p.closeInventory();
                }
                if (clickedOn != null && (clickedOn.getType() == Material.ENDER_PEARL)) {
                    event.setCancelled(true);
                    p.closeInventory();
                }
                if (clickedOn != null && (clickedOn.getType() == Material.BOW)) {
                    event.setCancelled(true);
                    p.closeInventory();
                }
                if (clickedOn != null && (clickedOn.getType() == Material.STICK)) {
                    event.setCancelled(true);
                    p.closeInventory();
                }
                if (clickedOn != null && (clickedOn.getType() == Material.DIAMOND_AXE)) {
                    event.setCancelled(true);
                    p.closeInventory();
                }
            }
        }

        Inventory clicked = event.getClickedInventory();
        final Player p = (Player) event.getWhoClicked();
        if (event.getClickedInventory() == null) return;
        if (event.getCurrentItem() == null) return;
        if (event.getClickedInventory().getType().equals(InventoryType.CHEST)) {
            if (clicked != event.getWhoClicked().getInventory()) {
                ItemStack onCursor = event.getCursor();

                if (onCursor != null && (onCursor.getType() == Material.ENDER_CHEST)) {
                    p.closeInventory();
                    event.setCancelled(true);
                }
            }
        }
        if (event.isCancelled() || !(event.getWhoClicked() instanceof Player)) return;
        if(event.getClickedInventory() == null) return;
            if (event.getClickedInventory().getType().equals(InventoryType.CHEST)) {
                if (event.getAction() == InventoryAction.HOTBAR_SWAP || event.getAction() == InventoryAction.HOTBAR_MOVE_AND_READD) {
                        event.setCancelled(true);
                        p.updateInventory();
                        p.closeInventory();
                }
            }
        }

    @EventHandler
    public void onInventoryDrag(InventoryDragEvent event) {
        ItemStack dragged = event.getOldCursor(); // O ITEM ESTÁ SENDO SEGURADO
        final Player p = (Player) event.getWhoClicked();
        if (dragged.getType() == Material.ENDER_CHEST) {
            int inventorySize = event.getInventory().getSize(); // TAMANHO DO INVENTARIO

            // FOR PARA VERIFICAR TODOS OS SLOTS
            for (int i : event.getRawSlots()) {
                if (i < inventorySize) {
                    event.setCancelled(true);
                    p.closeInventory();
                    break;
                }
            }
        }
        if (dragged.getType() == Material.DIAMOND_SWORD) {
            int inventorySize = event.getInventory().getSize(); // TAMANHO DO INVENTARIO

            // FOR PARA VERIFICAR TODOS OS SLOTS
            for (int i : event.getRawSlots()) {
                if (i < inventorySize) {
                    event.setCancelled(true);
                    p.closeInventory();
                    break;
                }
            }
        }
        if (dragged.getType() == Material.DIAMOND_AXE) {
            int inventorySize = event.getInventory().getSize(); // TAMANHO DO INVENTARIO

            // FOR PARA VERIFICAR TODOS OS SLOTS
            for (int i : event.getRawSlots()) {
                if (i < inventorySize) {
                    event.setCancelled(true);
                    p.closeInventory();
                    break;
                }
            }
        }
        if (dragged.getType() == Material.STICK) {
            int inventorySize = event.getInventory().getSize(); // TAMANHO DO INVENTARIO

            // FOR PARA VERIFICAR TODOS OS SLOTS
            for (int i : event.getRawSlots()) {
                if (i < inventorySize) {
                    event.setCancelled(true);
                    p.closeInventory();
                    break;
                }
            }
        }
        if (dragged.getType() == Material.DIAMOND_HELMET) {
            int inventorySize = event.getInventory().getSize(); // TAMANHO DO INVENTARIO

            // FOR PARA VERIFICAR TODOS OS SLOTS
            for (int i : event.getRawSlots()) {
                if (i < inventorySize) {
                    event.setCancelled(true);
                    p.closeInventory();
                    break;
                }
            }
        }
        if (dragged.getType() == Material.DIAMOND_CHESTPLATE) {
            int inventorySize = event.getInventory().getSize(); // TAMANHO DO INVENTARIO

            // FOR PARA VERIFICAR TODOS OS SLOTS
            for (int i : event.getRawSlots()) {
                if (i < inventorySize) {
                    event.setCancelled(true);
                    p.closeInventory();
                    break;
                }
            }
        }
        if (dragged.getType() == Material.DIAMOND_LEGGINGS) {
            int inventorySize = event.getInventory().getSize(); // TAMANHO DO INVENTARIO

            // FOR PARA VERIFICAR TODOS OS SLOTS
            for (int i : event.getRawSlots()) {
                if (i < inventorySize) {
                    event.setCancelled(true);
                    p.closeInventory();
                    break;
                }
            }
        }
        if (dragged.getType() == Material.DIAMOND_BOOTS) {
            int inventorySize = event.getInventory().getSize(); // TAMANHO DO INVENTARIO

            // FOR PARA VERIFICAR TODOS OS SLOTS
            for (int i : event.getRawSlots()) {
                if (i < inventorySize) {
                    event.setCancelled(true);
                    p.closeInventory();
                    break;
                }
            }
        }
    }
    
}
