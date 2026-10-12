import { Button, ButtonProps } from '@acmehealth/ui'

type SelectionBoxClearProps = Omit<ButtonProps, 'children'>

export const SelectionBoxClear = (props: SelectionBoxClearProps) => {
  return (
    <Button {...props} variant="plain" colorPalette="primary" size="sm">
      Clear
    </Button>
  )
}
