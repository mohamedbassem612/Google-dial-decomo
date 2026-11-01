package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class aacw extends java.lang.Exception {

    @java.lang.Deprecated
    public final com.google.android.gms.common.api.Status a;

    /* JADX WARN: Illegal instructions before constructor call */
    public aacw(com.google.android.gms.common.api.Status status) {
        int i = status.f;
        java.lang.String str = status.g;
        super(i + ": " + (str == null ? "" : str));
        this.a = status;
    }

    public final int a() {
        return this.a.f;
    }
}
