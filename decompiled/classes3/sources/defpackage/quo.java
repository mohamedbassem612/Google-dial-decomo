package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public enum quo implements alah {
    UNKNOWN(0),
    SHARPIE_SCAM_ALERT(1),
    SHARPIE_ACTIVE_INDICATOR(2),
    TEMPLATE_TAKEOVER(3),
    FERMAT_BEEP_ALERT(4),
    CONTACT_CHECKER_ALERT(5),
    BEACON(1001),
    DEBUG_INFO(1002),
    TEMPLATE_PROMO(2001),
    FERMAT(2002),
    SONIC(2003),
    ATLAS_PROMO(2004),
    XATU_PROMO(2005),
    ATLAS_AND_XATU_PROMO(2006),
    FERMAT_BUSINESS_PROMO(2007),
    BEACON_PROMO(2008),
    CALLER_ID_FEEDBACK(3000),
    AURORA_AVATAR(3001),
    TEST_HIGH_PRIORITY(100000),
    TEST_LOW_PRIORITY(100001);

    public final int u;

    quo(int i) {
        this.u = i;
    }

    public final int a() {
        return this.u;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.u);
    }
}
