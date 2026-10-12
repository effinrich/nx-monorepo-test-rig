import {
  DetailsCard,
  DetailsCardBody,
  DetailsCardHeader,
  DetailsCardRow,
  Page
} from '@acmehealth/portal/ui'

const EnvironmentDetails = () => (
  <Page>
    <DetailsCard>
      <DetailsCardHeader
        title="Environment Details"
        backButtonText="Back to dashboard"
      />
      <DetailsCardBody>
        {Object.entries(import.meta.env).map(([name, value]) => (
          <DetailsCardRow title={name} key={name}>
            {value}
          </DetailsCardRow>
        ))}
      </DetailsCardBody>
    </DetailsCard>
  </Page>
)
export default EnvironmentDetails
