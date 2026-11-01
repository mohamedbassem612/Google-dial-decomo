package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahez {
    public static final ahyp a = new evz(14);
    public static final ahyp b = new evz(15);

    public static defpackage.ahey a(android.content.Context context, ahyp ahypVar) {
        for (android.content.Context baseContext = context; !ahypVar.a(baseContext); baseContext = ((android.content.ContextWrapper) baseContext).getBaseContext()) {
            if (!(baseContext instanceof android.content.ContextWrapper)) {
                throw new java.lang.IllegalStateException("Cannot use base context of type " + java.lang.String.valueOf(context.getClass()) + " for ViewContext.");
            }
        }
        return new defpackage.ahey(context);
    }
}
