import { render } from '@acmehealth/shared-utils-jest'

import Dashboard from './dashboard'

describe('Dashboard', () => {
  it('should render successfully', () => {
    const { baseElement } = render(<Dashboard />)
    expect(baseElement).toBeTruthy()
  })
})
