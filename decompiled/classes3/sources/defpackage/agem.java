package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class agem extends ylc implements android.os.IInterface {
    final /* synthetic */ defpackage.ager a;
    public final zzx b;
    final xtq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agem(defpackage.ager agerVar, xtq xtqVar, zzx zzxVar) {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        j$.util.Objects.requireNonNull(agerVar);
        this.a = agerVar;
        this.c = xtqVar;
        this.b = zzxVar;
    }

    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        android.os.Bundle bundle = (android.os.Bundle) yld.a(parcel, android.os.Bundle.CREATOR);
        yld.c(parcel);
        a(bundle);
        return true;
    }

    public void a(android.os.Bundle bundle) {
        defpackage.agfc agfcVar = this.a.a;
        if (agfcVar != null) {
            zzx zzxVar = this.b;
            synchronized (agfcVar.e) {
                agfcVar.d.remove(zzxVar);
            }
            agfcVar.c(new defpackage.agey(agfcVar));
        }
        this.c.E("onGetLaunchReviewFlowInfo", new java.lang.Object[0]);
    }
}
