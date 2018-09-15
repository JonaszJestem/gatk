package org.broadinstitute.hellbender.tools.walkers.mutect;

import org.broadinstitute.barclay.argparser.Argument;


public class MitochondrialFiltersArgumentCollection extends M2FiltersArgumentCollection {
    private static final long serialVersionUID = 9345L;
    public static final String TLOD_BY_DEPTH = "tlod-divided-by-depth";
    public static final String NON_MT_ALT_READS_BY_ALT_READS = "non-mt-alts-divided-by-alts";

    /**
     * Only variants with TLOD divided by depth exceeding this threshold can pass filtering.
     */
    @Argument(fullName = TLOD_BY_DEPTH,
            doc="TLOD by depth threshold for filtering variant", optional = true)
    public double tlod_by_depth = .005;

    /**
     * Only variants with alt reads originally aligned outside of the mitochondria (known NuMTs) divided by total alt
     * reads exceeding this threshold can pass filtering.
     */
    @Argument(fullName = NON_MT_ALT_READS_BY_ALT_READS,
            doc="Known NuMT alts by total alts threshold for filtering variant", optional = true)
    public double non_mt_alt_by_alt = .85;

}
