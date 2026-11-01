package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public class appl extends defpackage.appe {
    @Override // defpackage.appe
    public final defpackage.appd a(defpackage.appp apppVar) {
        return new defpackage.appd(new java.io.RandomAccessFile(new java.io.File(apppVar.toString()), "r"));
    }

    public java.lang.String toString() {
        return "JvmSystemFileSystem";
    }
}
