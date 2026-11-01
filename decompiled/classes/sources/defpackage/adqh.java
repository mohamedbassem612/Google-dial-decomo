package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adqh {
    public static final defpackage.aimz a = defpackage.aimz.i("com/google/android/libraries/micore/telephony/common/audiomessages/AudioMessagesConfiguration");
    public final java.io.File b;
    public defpackage.adqf c = defpackage.adqf.a;

    public adqh(android.content.Context context) {
        this.b = new java.io.File(context.getFilesDir(), "audio_messages_config.proto");
    }

    public final java.lang.String a() {
        return this.c.b;
    }

    public final synchronized void b(defpackage.adqg adqgVar) {
        defpackage.akzx akzxVarL = this.c.L();
        akzxVarL.u();
        defpackage.adqf adqfVar = (defpackage.adqf) akzxVarL.b;
        java.lang.Object obj = adqgVar.a;
        j$.util.Objects.requireNonNull(obj);
        adqfVar.b = (java.lang.String) obj;
        akzxVarL.u();
        defpackage.adqf adqfVar2 = (defpackage.adqf) akzxVarL.b;
        java.lang.Object obj2 = adqgVar.b;
        j$.util.Objects.requireNonNull(obj2);
        adqfVar2.c = (java.lang.String) obj2;
        defpackage.adqf adqfVar3 = (defpackage.adqf) akzxVarL.r();
        if (adqfVar3.equals(this.c)) {
            return;
        }
        java.io.File file = this.b;
        defpackage.aihd aihdVarP = defpackage.aihd.p(new defpackage.aiso[0]);
        byte[] bArrI = adqfVar3.i();
        java.io.FileOutputStream fileOutputStreamI = defpackage.aiql.i(file, aihdVarP);
        try {
            fileOutputStreamI.write(bArrI);
            fileOutputStreamI.close();
            this.b.getPath();
            this.c = adqfVar3;
        } catch (java.lang.Throwable th) {
            try {
                fileOutputStreamI.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
