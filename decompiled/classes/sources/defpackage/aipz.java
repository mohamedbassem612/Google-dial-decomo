package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aipz implements defpackage.aipq {
    public final java.lang.String a;
    public final boolean b;
    public final java.util.logging.Level c;
    public final java.util.Set d;
    public final defpackage.aioy e;
    public final int f;

    public aipz(java.lang.String str, boolean z, int i, java.util.logging.Level level, java.util.Set set, defpackage.aioy aioyVar) {
        this.a = str;
        this.b = z;
        this.f = i;
        this.c = level;
        this.d = set;
        this.e = aioyVar;
    }

    @Override // defpackage.aipq
    public final defpackage.aion a(java.lang.String str) {
        return new defpackage.aiqb(this.a, str, this.b, this.f, this.c, this.d, this.e);
    }
}
