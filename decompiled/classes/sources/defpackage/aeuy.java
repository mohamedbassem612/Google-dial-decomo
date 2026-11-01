package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeuy {
    public final int c;
    public final short[] a = new short[256];
    public final short[] b = new short[256];
    public long d = 0;

    public aeuy(java.util.Random random) {
        this.c = (random.nextInt() & (-33686019)) | android.R.attr.cacheColorHint;
    }
}
