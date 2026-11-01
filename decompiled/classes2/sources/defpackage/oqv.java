package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class oqv implements defpackage.oqx {
    private final /* synthetic */ int $cid;
    final /* synthetic */ android.content.Context a;
    final /* synthetic */ defpackage.jjx b;
    final /* synthetic */ java.lang.Enum c;

    public oqv(android.content.Context context, defpackage.jjx jjxVar, java.lang.Enum r3, int i) {
        this.$cid = i;
        this.a = context;
        this.b = jjxVar;
        this.c = r3;
    }

    @Override // defpackage.oqx
    public final int a() {
        int i = this.$cid;
        if (i == 0 || i == 1) {
            return 2131231989;
        }
        return i != 2 ? 2131231051 : 2131231077;
    }

    @Override // defpackage.oqx
    public final java.lang.String b() {
        int i = this.$cid;
        if (i == 0) {
            return this.a.getString(2132019874);
        }
        if (i == 1) {
            android.content.Context context = this.a;
            return context.getString(yee.g(context) + (-1) != 0 ? 2132017692 : 2132017691);
        }
        if (i == 2) {
            return this.a.getString(2132020642);
        }
        android.content.Context context2 = this.a;
        return i != 3 ? context2.getString(2132017579) : context2.getString(2132017570);
    }

    @Override // defpackage.oqx
    public final void c(az azVar) {
        int i = this.$cid;
        if (i == 0) {
            android.content.Context context = this.a;
            oqw oqwVarAt = pez.at(context);
            ahok ahokVarF = oqwVarAt.fi().f(417, "Clicked not scam HistoryItemAction");
            try {
                defpackage.jmc.c(context, this.b);
                oqwVarAt.bt().o(this.c);
                ahokVarF.close();
                return;
            } catch (java.lang.Throwable th) {
                try {
                    ahokVarF.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (i == 1) {
            android.content.Context context2 = this.a;
            ahok ahokVarF2 = pez.at(context2).fi().f(416, "Clicked not spam HistoryItemAction");
            try {
                defpackage.jmc.d(context2, this.b);
                pez.at(context2).bt().n(this.c);
                ahokVarF2.close();
                return;
            } catch (java.lang.Throwable th3) {
                try {
                    ahokVarF2.close();
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        if (i == 2) {
            android.content.Context context3 = this.a;
            ahok ahokVarF3 = pez.at(context3).fi().f(418, "Clicked unblock HistoryItemAction");
            try {
                defpackage.jmc.e(context3, this.b);
                pez.at(context3).bt().n(this.c);
                ahokVarF3.close();
                return;
            } catch (java.lang.Throwable th5) {
                try {
                    ahokVarF3.close();
                } catch (java.lang.Throwable th6) {
                    th5.addSuppressed(th6);
                }
                throw th5;
            }
        }
        android.content.Context context4 = this.a;
        if (i != 3) {
            ahok ahokVarF4 = pez.at(context4).fi().f(420, "Clicked block/report spam HistoryItemAction");
            try {
                defpackage.jmc.b(context4, this.b);
                pez.at(context4).bt().o(this.c);
                ahokVarF4.close();
                return;
            } catch (java.lang.Throwable th7) {
                try {
                    ahokVarF4.close();
                } catch (java.lang.Throwable th8) {
                    th7.addSuppressed(th8);
                }
                throw th7;
            }
        }
        ahok ahokVarF5 = pez.at(context4).fi().f(419, "Clicked block/report spam HistoryItemAction");
        try {
            defpackage.jmc.a(context4, this.b);
            pez.at(context4).bt().n(this.c);
            ahokVarF5.close();
        } catch (java.lang.Throwable th9) {
            try {
                ahokVarF5.close();
            } catch (java.lang.Throwable th10) {
                th9.addSuppressed(th10);
            }
            throw th9;
        }
    }

    @Override // defpackage.oqx
    public final void e() {
        int i = this.$cid;
        if (i == 0) {
            c(null);
            return;
        }
        if (i == 1) {
            c(null);
            return;
        }
        if (i == 2) {
            c(null);
        } else if (i != 3) {
            c(null);
        } else {
            c(null);
        }
    }

    @Override // defpackage.oqx
    public final /* synthetic */ void d() {
    }
}
