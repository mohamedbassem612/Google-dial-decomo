package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class hum {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/assisteddialing/impl/ConcreteCreatorImpl");
    private final android.content.Context b;
    private final defpackage.huo c;
    private final defpackage.oko d;

    public hum(android.content.Context context, defpackage.huo huoVar, defpackage.oko okoVar) {
        if (context == null) {
            defpackage.aooh.i("appContext");
        }
        this.b = context;
        this.c = huoVar;
        this.d = okoVar;
    }

    public final hud a() {
        android.content.Context context = this.b;
        if (!defpackage.abyl.i(context)) {
            ((defpackage.aimw) a.b().l("com/android/dialer/assisteddialing/impl/ConcreteCreatorImpl", "createNewAssistedDialingMediator", 55, "ConcreteCreatorImpl.kt")).v("user is locked");
            return new huj();
        }
        if (android.preference.PreferenceManager.getDefaultSharedPreferences(context).getBoolean(context.getString(2132017366), true)) {
            return new hui(new hun(this.d, android.preference.PreferenceManager.getDefaultSharedPreferences(context).getString(context.getString(2132017363), null)), this.c);
        }
        ((defpackage.aimw) a.b().l("com/android/dialer/assisteddialing/impl/ConcreteCreatorImpl", "createNewAssistedDialingMediator", 63, "ConcreteCreatorImpl.kt")).v("disabled by local setting");
        return new huj();
    }
}
