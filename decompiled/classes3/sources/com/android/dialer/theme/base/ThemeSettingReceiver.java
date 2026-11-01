package com.android.dialer.theme.base;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ThemeSettingReceiver extends defpackage.ure {
    private static final aimz f = aimz.i("com/android/dialer/theme/base/ThemeSettingReceiver");
    public rlv c;
    public urg d;
    public ipc e;

    private final void a(android.content.Intent intent, defpackage.uri uriVar) {
        urf urfVarA;
        if (intent.hasExtra("THEME")) {
            urfVarA = urf.a(intent.getIntExtra("THEME", -1));
            f.b().l("com/android/dialer/theme/base/ThemeSettingReceiver", "updateDarkTheme", 62, "ThemeSettingReceiver.java").I("receive intent: package=%s, theme=%s", intent.getPackage(), urfVarA);
        } else {
            if (!intent.hasExtra("DARK_MODE_ENABLED")) {
                return;
            }
            boolean booleanExtra = intent.getBooleanExtra("DARK_MODE_ENABLED", false);
            f.b().l("com/android/dialer/theme/base/ThemeSettingReceiver", "updateDarkTheme", 67, "ThemeSettingReceiver.java").J("receive intent: package=%s, enable dark mode=%s", intent.getPackage(), booleanExtra);
            urf urfVarH = this.d.h();
            if (booleanExtra) {
                urfVarA = urf.b;
            } else {
                urfVarA = urf.a;
                if (urfVarH != urfVarA) {
                    urfVarA = urf.c;
                }
            }
        }
        this.d.j(urfVarA);
        uriVar.a(urfVarA);
    }

    @Override // defpackage.ure, android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        char c = 1;
        if (!this.a) {
            synchronized (this.b) {
                if (!this.a) {
                    ((urj) ajsz.dC(context)).im(this);
                    this.a = true;
                }
            }
        }
        if ("com.google.android.comms.action.THEME_CHANGE".equals(intent.getAction())) {
            final char c2 = c == true ? 1 : 0;
            a(intent, new defpackage.uri(this) { // from class: urh
                public final /* synthetic */ com.android.dialer.theme.base.ThemeSettingReceiver a;

                {
                    this.a = this;
                }

                @Override // defpackage.uri
                public final void a(urf urfVar) {
                    rmu rmuVar;
                    rmw rmwVar;
                    int i = c2;
                    com.android.dialer.theme.base.ThemeSettingReceiver themeSettingReceiver = this.a;
                    if (i != 0) {
                        rlv rlvVar = themeSettingReceiver.c;
                        int iOrdinal = urfVar.ordinal();
                        if (iOrdinal != 0) {
                            rmwVar = iOrdinal != 1 ? rmw.jt : rmw.js;
                        } else {
                            rmwVar = rmw.jr;
                        }
                        rlvVar.n(rmwVar);
                        return;
                    }
                    ipc ipcVar = themeSettingReceiver.e;
                    int iOrdinal2 = urfVar.ordinal();
                    if (iOrdinal2 != 0) {
                        rmuVar = iOrdinal2 != 1 ? rmu.h : rmu.e;
                    } else {
                        rmuVar = rmu.c;
                    }
                    ipcVar.bm(rmuVar);
                }
            });
            return;
        }
        final int i = 0;
        if ("com.google.android.dialer.GROWTHKIT_THEME_CHANGE".equals(intent.getAction())) {
            a(intent, new defpackage.uri(this) { // from class: urh
                public final /* synthetic */ com.android.dialer.theme.base.ThemeSettingReceiver a;

                {
                    this.a = this;
                }

                @Override // defpackage.uri
                public final void a(urf urfVar) {
                    rmu rmuVar;
                    rmw rmwVar;
                    int i2 = i;
                    com.android.dialer.theme.base.ThemeSettingReceiver themeSettingReceiver = this.a;
                    if (i2 != 0) {
                        rlv rlvVar = themeSettingReceiver.c;
                        int iOrdinal = urfVar.ordinal();
                        if (iOrdinal != 0) {
                            rmwVar = iOrdinal != 1 ? rmw.jt : rmw.js;
                        } else {
                            rmwVar = rmw.jr;
                        }
                        rlvVar.n(rmwVar);
                        return;
                    }
                    ipc ipcVar = themeSettingReceiver.e;
                    int iOrdinal2 = urfVar.ordinal();
                    if (iOrdinal2 != 0) {
                        rmuVar = iOrdinal2 != 1 ? rmu.h : rmu.e;
                    } else {
                        rmuVar = rmu.c;
                    }
                    ipcVar.bm(rmuVar);
                }
            });
        } else if ("com.google.android.comms.action.CHECK_THEME".equals(intent.getAction())) {
            f.b().l("com/android/dialer/theme/base/ThemeSettingReceiver", "onReceive", 39, "ThemeSettingReceiver.java").y("receive check theme intent: package=%s", intent.getPackage());
            int i2 = this.d.h().d;
            context.sendBroadcast(new android.content.Intent().putExtra("DARK_MODE_ENABLED", i2 == 2).putExtra("THEME", i2).setPackage("com.google.android.contacts").setAction("com.google.android.comms.action.THEME_CHANGE"));
        }
    }
}
