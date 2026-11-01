package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dip {
    public final java.lang.String a;
    public final defpackage.aonn b;
    public boolean c;

    public /* synthetic */ dip(java.lang.String str) {
        this(str, new defpackage.dim(13));
    }

    public final java.lang.String toString() {
        return "AccessibilityKey: ".concat(this.a);
    }

    public dip(java.lang.String str, defpackage.aonn aonnVar) {
        this.a = str;
        this.b = aonnVar;
    }

    public dip(java.lang.String str, byte[] bArr) {
        this(str);
        this.c = true;
    }

    public dip(java.lang.String str, boolean z, defpackage.aonn aonnVar) {
        this(str, aonnVar);
        this.c = z;
    }
}
