    private TableCellRenderer getRenderer() {
        return new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table,
                    Object value, boolean isSelected, boolean hasFocus,
                    int row, int column) {
                Component tableCellRendererComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus,row, column);
                if("doc".equals(value)){
                    tableCellRendererComponent.setBackground(Color.YELLOW);
                } else  if("xlsx".equals(value)){
                    tableCellRendererComponent.setBackground(Color.GREEN);
                } else {
                    tableCellRendererComponent.setBackground(isSelected ? table.getSelectionBackground() : table.getBackground());
                }
                return tableCellRendererComponent;
            }
        };
    }