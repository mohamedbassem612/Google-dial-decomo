package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class twe extends java.lang.RuntimeException {
    public defpackage.twg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public twe(java.lang.String str, defpackage.twg twgVar) {
        super(str);
        aooh.f(twgVar, "error");
        this.a = twgVar;
    }

    public twe(java.lang.Exception exc) {
        super(exc);
    }
}
