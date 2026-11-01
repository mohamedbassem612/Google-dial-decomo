package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class nnf implements defpackage.iqf, defpackage.aood {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public nnf(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // defpackage.iqf
    public final /* synthetic */ defpackage.albh a(defpackage.albh albhVar, defpackage.albh albhVar2) {
        defpackage.albh albhVar3;
        if (this.$cid != 0) {
            defpackage.jbr jbrVar = (defpackage.jbr) albhVar;
            albhVar3 = (defpackage.jbr) albhVar2;
            defpackage.aooh.f(jbrVar, "p0");
            defpackage.aooh.f(albhVar3, "p1");
            jbn jbnVarB = jbn.b(jbrVar.c);
            if (jbnVarB == null) {
                jbnVarB = jbn.e;
            }
            java.lang.Object obj = this.a;
            if (jbnVarB != jbn.a) {
                ((defpackage.aimw) defpackage.jax.b.b().l("com/android/dialer/beesly/impl/settings/service/BeeslyBackup", "migrationFromBackup", 53, "BeeslyBackup.kt")).v("Settings are already updated, ignoring backup.");
                ((defpackage.jax) obj).e.o(defpackage.rmx.BEESLY_SETTINGS_ALREADY_MODIFIED);
                return jbrVar;
            }
            ((defpackage.jax) obj).e.o(defpackage.rmx.BEESLY_SETTINGS_RESTORED);
        } else {
            defpackage.nok nokVar = (defpackage.nok) albhVar;
            albhVar3 = (defpackage.nok) albhVar2;
            defpackage.aooh.f(nokVar, "p0");
            defpackage.aooh.f(albhVar3, "p1");
            noh nohVarB = noh.b(nokVar.c);
            if (nohVarB == null) {
                nohVarB = noh.k;
            }
            java.lang.Object obj2 = this.a;
            if (nohVarB != noh.a || (nokVar.b & 8) != 0) {
                ((defpackage.aimw) defpackage.nni.b.b().l("com/android/dialer/dobby/impl/settings/service/DobbyBackup", "migrateFromBackup", 50, "DobbyBackup.kt")).v("User changed settings, ignoring backup.");
                ((defpackage.nni) obj2).d.o(defpackage.rmx.RESTORE_DOBBY_ALREADY_MODIFIED);
                return nokVar;
            }
            ((defpackage.nni) obj2).d.o(defpackage.rmx.RESTORE_DOBBY_RESTORED);
        }
        return albhVar3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this.$cid != 0) {
            if ((obj instanceof defpackage.iqf) && (obj instanceof defpackage.aood)) {
                return defpackage.aooh.n(ex(), ((defpackage.aood) obj).ex());
            }
            return false;
        }
        if ((obj instanceof defpackage.iqf) && (obj instanceof defpackage.aood)) {
            return defpackage.aooh.n(ex(), ((defpackage.aood) obj).ex());
        }
        return false;
    }

    @Override // defpackage.aood
    public final defpackage.aoio ex() {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        return i != 0 ? new defpackage.aoof(2, obj, defpackage.jax.class, "migrationFromBackup", "migrationFromBackup(Lcom/android/dialer/beesly/impl/settings/service/BeeslySettingsData;Lcom/android/dialer/beesly/impl/settings/service/BeeslySettingsData;)Lcom/android/dialer/beesly/impl/settings/service/BeeslySettingsData;", 0) : new defpackage.aoof(2, obj, defpackage.nni.class, "migrateFromBackup", "migrateFromBackup(Lcom/android/dialer/dobby/impl/settings/service/DobbySettingsData;Lcom/android/dialer/dobby/impl/settings/service/DobbySettingsData;)Lcom/android/dialer/dobby/impl/settings/service/DobbySettingsData;", 0);
    }

    public final int hashCode() {
        int i = this.$cid;
        defpackage.aoio aoioVarEx = ex();
        return i != 0 ? aoioVarEx.hashCode() : aoioVarEx.hashCode();
    }
}
