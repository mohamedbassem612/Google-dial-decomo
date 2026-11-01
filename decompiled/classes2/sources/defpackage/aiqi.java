package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aiqi extends defpackage.aiqf {
    public static final defpackage.aiqf a = new defpackage.aiqi();

    @Override // defpackage.aiqf
    public final aion a(java.lang.String str) {
        return new defpackage.aiqc(java.util.logging.Logger.getLogger(str.replace('$', '.')));
    }

    public final java.lang.String toString() {
        return "Default logger backend factory";
    }
}
