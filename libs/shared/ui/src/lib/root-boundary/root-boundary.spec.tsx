import { render } from '@acmehealth/shared-utils-jest'

import { RootBoundary } from './root-boundary'

describe('RootBoundary', () => {
  it('should render successfully', () => {
    const { baseElement } = render(<RootBoundary />)
    expect(baseElement).toBeTruthy()
  })
})
