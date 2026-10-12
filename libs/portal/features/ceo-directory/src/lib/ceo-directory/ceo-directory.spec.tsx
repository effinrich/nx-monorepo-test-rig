import { render, screen } from '@acmehealth/shared-utils-jest'

import CeoDirectory from './ceo-directory'

describe('CeoDirectory', () => {
  it('should render successfully', () => {
    render(<CeoDirectory />)
    expect(screen.getByText('CEO Directory')).toBeInTheDocument()
  })
})
