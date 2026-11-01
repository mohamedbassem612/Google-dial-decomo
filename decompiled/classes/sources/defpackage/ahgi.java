package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ahgi extends android.content.ContextWrapper implements defpackage.ahfx {
    private final defpackage.ahzi a;

    /* JADX WARN: Illegal instructions before constructor call */
    public ahgi(defpackage.aw awVar, android.view.LayoutInflater layoutInflater) {
        android.content.Context context = layoutInflater.getContext();
        context.getClass();
        b(context, a(awVar));
        super(context);
        this.a = defpackage.ahvr.bI(new defpackage.jvu(this, layoutInflater, 17, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static java.util.Locale a(defpackage.aw awVar) {
        java.util.Locale localeAZ;
        if ((awVar instanceof defpackage.ahgg) && (localeAZ = ((defpackage.ahgg) awVar).aZ()) != null) {
            return localeAZ;
        }
        defpackage.aw awVar2 = awVar.E;
        if (awVar2 != null) {
            return a(awVar2);
        }
        return null;
    }

    private static void b(android.content.Context context, java.util.Locale locale) {
        if (locale != null) {
            android.content.res.Configuration configuration = new android.content.res.Configuration();
            configuration.locale = locale;
            android.content.res.Resources resources = context.getResources();
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.Object getSystemService(java.lang.String str) {
        return !"layout_inflater".equals(str) ? getBaseContext().getSystemService(str) : this.a.eZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahgi(defpackage.aw awVar, android.content.Context context) {
        super(context);
        context.getClass();
        b(context, a(awVar));
        this.a = defpackage.ahvr.bI(new defpackage.ahgh(this, 0));
    }
}
