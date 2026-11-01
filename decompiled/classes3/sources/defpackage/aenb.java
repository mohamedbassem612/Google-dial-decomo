package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class aenb extends java.lang.Exception {
    public abstract aadl a();

    public abstract com.google.android.gms.common.api.Status b();

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return b().toString();
    }
}
