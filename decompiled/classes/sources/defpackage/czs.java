package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class czs extends defpackage.czi {
    @Override // defpackage.czi
    public final float a(float f, defpackage.cxi cxiVar, defpackage.cxi cxiVar2) {
        return java.lang.Float.intBitsToFloat((int) (cxiVar2.i(cxiVar, (((long) java.lang.Float.floatToRawIntBits(f)) << 32) | (((long) java.lang.Float.floatToRawIntBits(((int) (cxiVar.h() & 4294967295L)) / 2.0f)) & 4294967295L)) >> 32));
    }
}
