package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qep {
    public boolean a;
    public final long b;
    public boolean c;
    private final java.lang.StringBuilder d = new java.lang.StringBuilder();

    public qep(long j) {
        this.b = j;
    }

    public final java.lang.String a() {
        return this.d.toString();
    }

    public final void b(java.lang.String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\b') {
                java.lang.StringBuilder sb = this.d;
                if (sb.length() <= 0 || sb.charAt(sb.length() - 1) == '\b') {
                    cCharAt = '\b';
                    this.d.append(cCharAt);
                } else {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                this.d.append(cCharAt);
            }
        }
    }

    public final void c() {
        this.c = true;
    }

    public final void d() {
        this.c = false;
    }

    public final void e() {
        this.a = true;
    }
}
