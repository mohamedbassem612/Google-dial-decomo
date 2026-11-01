package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class alch extends java.lang.RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public alch() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final defpackage.alaz a() {
        return new defpackage.alaz(getMessage());
    }
}
