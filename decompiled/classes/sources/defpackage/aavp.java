package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aavp implements defpackage.aadl {
    public final com.google.android.gms.usagereporting.UsageReportingOptInOptions a;
    private final com.google.android.gms.common.api.Status b;

    public aavp(com.google.android.gms.common.api.Status status, com.google.android.gms.usagereporting.UsageReportingOptInOptions usageReportingOptInOptions) {
        this.b = status;
        this.a = usageReportingOptInOptions;
    }

    @Override // defpackage.aadl
    public final com.google.android.gms.common.api.Status b() {
        return this.b;
    }

    public final java.lang.String toString() {
        com.google.android.gms.usagereporting.UsageReportingOptInOptions usageReportingOptInOptions = this.a;
        defpackage.aais.as(usageReportingOptInOptions);
        return java.lang.String.format("OptInOptionsResultImpl[%s]", java.lang.Boolean.valueOf(usageReportingOptInOptions.a == 1));
    }
}
