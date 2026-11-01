package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hrp {
    public ld a;
    public ld b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public hrp(ld ldVar, ld ldVar2, float f, float f2, float f3, float f4) {
        this.a = ldVar;
        this.b = ldVar2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    public final java.lang.String toString() {
        return "ChangeInfo{oldHolder=" + java.lang.String.valueOf(this.a) + ", newHolder=" + java.lang.String.valueOf(this.b) + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
    }
}
