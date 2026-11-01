package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class eim extends java.lang.RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public eim() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final defpackage.eho a() {
        return new defpackage.eho(getMessage());
    }
}
