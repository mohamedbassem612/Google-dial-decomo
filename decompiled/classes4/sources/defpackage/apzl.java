package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apzl extends java.lang.RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public apzl() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final defpackage.apym a() {
        return new defpackage.apym(getMessage());
    }
}
