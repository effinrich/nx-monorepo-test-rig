import {
  EntityModelMapObjectObject,
  PersonSummary
} from '@acmehealth/company-api-types'
import { axiosApi } from '@acmehealth/portal/data-assets'
import { parseRequest } from '@acmehealth/portal/utils'

export const removePersonRole = async (
  email: PersonSummary['email'],
  authority: NonNullable<PersonSummary['roles']>[number]['authority']
) => {
  const { error, response } = await parseRequest<EntityModelMapObjectObject>(
    axiosApi.delete(`/person/${email}/role/${authority}`)
  )

  if (error) throw error
  return response.data
}
