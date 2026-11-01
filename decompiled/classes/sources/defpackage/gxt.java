package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class gxt implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ java.lang.String c;

    public /* synthetic */ gxt(long j, java.lang.String str, int i) {
        this.$cid = i;
        this.a = "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        this.b = j;
        this.c = str;
    }

    @Override // defpackage.aonj
    public final java.lang.Object a(java.lang.Object obj) {
        if (this.$cid != 0) {
            defpackage.gjh gjhVar = (defpackage.gjh) obj;
            java.lang.String str = this.c;
            long j = this.b;
            if (gjhVar == null) {
                defpackage.aooh.i("_connection");
            }
            defpackage.gin ginVarA = gjhVar.a(this.a);
            try {
                ginVarA.h(1, j);
                ginVarA.j(2, str);
                ginVarA.m();
                return java.lang.Integer.valueOf(defpackage.dez.i(gjhVar));
            } finally {
                ginVarA.close();
            }
        }
        defpackage.gjh gjhVar2 = (defpackage.gjh) obj;
        java.lang.String str2 = this.c;
        long j2 = this.b;
        if (gjhVar2 == null) {
            defpackage.aooh.i("_connection");
        }
        defpackage.gin ginVarA2 = gjhVar2.a(this.a);
        try {
            ginVarA2.h(1, j2);
            ginVarA2.j(2, str2);
            ginVarA2.m();
            return defpackage.aojh.a;
        } finally {
            ginVarA2.close();
        }
    }

    public /* synthetic */ gxt(long j, java.lang.String str, int i, byte[] bArr) {
        this.$cid = i;
        this.a = "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        this.b = j;
        this.c = str;
    }
}
