package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aavf extends defpackage.aavn {
    final /* synthetic */ defpackage.zzx a;

    public aavf(defpackage.abce abceVar, defpackage.zzx zzxVar) {
        this.a = zzxVar;
        j$.util.Objects.requireNonNull(abceVar);
    }

    @Override // defpackage.aavn
    public final void a(com.google.android.gms.common.api.Status status, com.google.android.gms.usagereporting.UsageReportingOptInOptions usageReportingOptInOptions) {
        defpackage.aais.ax(status, new defpackage.aiyy(new defpackage.aavp(com.google.android.gms.common.api.Status.a, usageReportingOptInOptions)), this.a);
    }
}
