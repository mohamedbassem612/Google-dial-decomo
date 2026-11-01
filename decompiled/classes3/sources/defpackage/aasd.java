package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aasd extends defpackage.aaql {
    final /* synthetic */ xm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aasd(aaoo aaooVar, aade aadeVar, xm xmVar) {
        super(aadeVar);
        this.a = xmVar;
        j$.util.Objects.requireNonNull(aaooVar);
    }

    protected final /* synthetic */ aadl a(com.google.android.gms.common.api.Status status) {
        return new defpackage.aasc(this, status);
    }

    protected final /* bridge */ /* synthetic */ void b(aacr aacrVar) {
        ((defpackage.aasa) aacrVar).P(this, this.a.a);
    }
}
