package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class tsa implements iqf, aood {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public tsa(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final /* synthetic */ albh a(albh albhVar, albh albhVar2) {
        if (this.$cid == 0) {
            tru truVar = (tru) albhVar;
            tru truVar2 = (tru) albhVar2;
            aooh.f(truVar, "p0");
            aooh.f(truVar2, "p1");
            if (defpackage.trv.a.a(truVar)) {
                tsc.a.b().l("com/android/dialer/sharpie/impl/settings/service/SharpieBackup", "migrateFromBackup", 61, "SharpieBackup.kt").v("User changed settings, ignoring backup.");
                return truVar;
            }
            tsc.a.b().l("com/android/dialer/sharpie/impl/settings/service/SharpieBackup", "migrateFromBackup", 64, "SharpieBackup.kt").v("Restoring settings from backup.");
            return truVar2;
        }
        owz owzVar = (owz) albhVar;
        owz owzVar2 = (owz) albhVar2;
        aooh.f(owzVar, "p0");
        aooh.f(owzVar2, "p1");
        defpackage.owy owyVarB = defpackage.owy.b(owzVar.b);
        if (owyVarB == null) {
            owyVarB = defpackage.owy.UNRECOGNIZED;
        }
        java.lang.Object obj = this.a;
        if (owyVarB == defpackage.owy.SELECTED_ANSWER_METHOD_UNKNOWN) {
            ((defpackage.owx) obj).d.o(rmx.dm);
            return owzVar2;
        }
        defpackage.owx.b.b().l("com/android/dialer/incall/answer/method/settings/service/AnswerMethodBackup", "migrateFromBackup", 50, "AnswerMethodBackup.kt").v("User already updated the settings, ignoring backup.");
        ((defpackage.owx) obj).d.o(rmx.dl);
        return owzVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this.$cid != 0) {
            if ((obj instanceof iqf) && (obj instanceof aood)) {
                return aooh.n(ex(), ((aood) obj).ex());
            }
            return false;
        }
        if ((obj instanceof iqf) && (obj instanceof aood)) {
            return aooh.n(ex(), ((aood) obj).ex());
        }
        return false;
    }

    public final aoio ex() {
        int i = this.$cid;
        java.lang.Object obj = this.a;
        return i != 0 ? new aoof(2, obj, defpackage.owx.class, "migrateFromBackup", "migrateFromBackup(Lcom/android/dialer/incall/answer/method/settings/service/AnswerMethodSettingsData;Lcom/android/dialer/incall/answer/method/settings/service/AnswerMethodSettingsData;)Lcom/android/dialer/incall/answer/method/settings/service/AnswerMethodSettingsData;", 0) : new aoof(2, obj, tsc.class, "migrateFromBackup", "migrateFromBackup(Lcom/android/dialer/sharpie/impl/settings/datastore/SharpieSettingsData;Lcom/android/dialer/sharpie/impl/settings/datastore/SharpieSettingsData;)Lcom/android/dialer/sharpie/impl/settings/datastore/SharpieSettingsData;", 0);
    }

    public final int hashCode() {
        int i = this.$cid;
        aoio aoioVarEx = ex();
        return i != 0 ? aoioVarEx.hashCode() : aoioVarEx.hashCode();
    }
}
