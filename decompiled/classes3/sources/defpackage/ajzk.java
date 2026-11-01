package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ajzk {
    public java.lang.String a;
    public defpackage.ajzl c;
    public java.lang.String f;
    public final aiii b = new aidf((byte[]) null);
    public boolean d = true;
    public int e = 3;
    public boolean g = false;
    public java.lang.Long h = null;
    public final java.util.Set i = new java.util.HashSet();
    java.lang.Integer j = null;
    java.lang.Integer k = null;

    public final void a(aiii aiiiVar) {
        this.b.y(aiiiVar);
    }

    public final void b(defpackage.ajzj ajzjVar, java.lang.String str) {
        ahvr.ci(str);
        this.b.t(ajzjVar, str);
    }

    public final void c(long j) {
        this.h = java.lang.Long.valueOf(j);
    }

    public final void d(java.lang.String str) {
        boolean z = true;
        if (!str.equals("GET") && !str.equals("HEAD") && !str.equals("DELETE") && !str.equals("POST") && !str.equals("PATCH") && !str.equals("PUT")) {
            z = false;
        }
        ahvr.bY(z);
        this.f = str;
    }

    public final void e(java.lang.String str, java.nio.ByteBuffer byteBuffer) {
        ahvr.ci(str);
        ahvr.ci(byteBuffer);
        boolean z = true;
        if (!byteBuffer.isDirect() && byteBuffer.isReadOnly()) {
            z = false;
        }
        ahvr.bZ(z, "Post body cannot be a ByteBuffer that is non-direct and readonly");
        this.c = new defpackage.ajzl(str, byteBuffer);
    }

    public final void f(java.lang.String str) {
        ahvr.ci(str);
        this.a = str;
    }
}
