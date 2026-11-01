package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aawo extends defpackage.aawn {
    final /* synthetic */ java.lang.String a = "dialer_wear";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aawo(aaoo aaooVar, aade aadeVar, java.lang.String str) {
        super(aadeVar);
        j$.util.Objects.requireNonNull(aaooVar);
    }

    protected final /* synthetic */ aadl a(com.google.android.gms.common.api.Status status) {
        return new defpackage.aaxc(status, null, 1);
    }

    protected final /* bridge */ /* synthetic */ void b(aacr aacrVar) {
        defpackage.aaxn aaxnVar = (defpackage.aaxn) ((defpackage.aayc) aacrVar).v();
        defpackage.aaxu aaxuVar = new defpackage.aaxu(this);
        android.os.Parcel parcelEP = aaxnVar.eP();
        yld.f(parcelEP, aaxuVar);
        parcelEP.writeString(this.a);
        parcelEP.writeInt(0);
        aaxnVar.eR(42, parcelEP);
    }
}
