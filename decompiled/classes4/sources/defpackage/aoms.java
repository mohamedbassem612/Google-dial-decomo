package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aoms extends defpackage.aomv {
    private boolean b;
    private java.io.File[] c;
    private int d;
    private boolean e;

    public aoms(java.io.File file) {
        super(file);
    }

    @Override // defpackage.aomv
    public final java.io.File a() {
        int i;
        if (!this.e && this.c == null) {
            java.io.File[] fileArrListFiles = this.a.listFiles();
            this.c = fileArrListFiles;
            if (fileArrListFiles == null) {
                this.e = true;
            }
        }
        java.io.File[] fileArr = this.c;
        if (fileArr != null && (i = this.d) < fileArr.length) {
            this.d = i + 1;
            return fileArr[i];
        }
        if (this.b) {
            return null;
        }
        this.b = true;
        return this.a;
    }

    public aoms(java.io.File file, byte[] bArr) {
        this(file);
    }
}
