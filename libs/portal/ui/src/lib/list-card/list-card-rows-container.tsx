import { ListRoot, type ListRootProps } from '@acmehealth/ui'

type ListCardRowsContainerProps = ListRootProps

export const ListCardRowsContainer = (props: ListCardRowsContainerProps) => {
  return <ListRoot variant="striped" {...props} />
}
