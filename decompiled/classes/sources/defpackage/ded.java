package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ded extends defpackage.aoof implements defpackage.aomy {
    private final /* synthetic */ int $cid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ded(java.lang.Object obj, int i, byte[] bArr) {
        super(0, obj, defpackage.ani.class, "requestFocus", "requestFocus()Z", 0);
        this.$cid = i;
    }

    @Override // defpackage.aomy
    public final /* synthetic */ java.lang.Object a() {
        switch (this.$cid) {
            case 0:
                defpackage.deg degVar = (defpackage.deg) this.e;
                baa$.ExternalSyntheticApiModelOutline1.m(degVar, 1);
                android.view.contentcapture.ContentCaptureSession contentCaptureSessionM = da$.ExternalSyntheticApiModelOutline0.m(degVar);
                if (contentCaptureSessionM != null) {
                    return new defpackage.enr(contentCaptureSessionM, degVar);
                }
                return null;
            case 1:
                return java.lang.Boolean.valueOf(((defpackage.ani) this.e).d.i(7));
            case 2:
                ((defpackage.gat) this.e).b();
                return defpackage.aojh.a;
            case 3:
                ((defpackage.gat) this.e).b();
                return defpackage.aojh.a;
            case 4:
                defpackage.gfn gfnVar = (defpackage.gfn) this.e;
                synchronized (gfnVar.j) {
                    hgu hguVar = gfnVar.k;
                    defpackage.gfq gfqVar = gfnVar.c.e;
                    java.util.concurrent.locks.ReentrantLock reentrantLock = gfqVar.a;
                    reentrantLock.lock();
                    try {
                        boolean[] zArr = gfqVar.c;
                        java.util.Arrays.fill(zArr, 0, zArr.length, false);
                        gfqVar.d = true;
                        reentrantLock.unlock();
                    } catch (java.lang.Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                return defpackage.aojh.a;
            case 5:
                defpackage.ailj it = ((defpackage.aihd) ((defpackage.kaw) this.e).a).iterator();
                defpackage.aooh.e(it, "iterator(...)");
                while (it.hasNext()) {
                    ((defpackage.kau) it.next()).d();
                }
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.ailj it2 = ((defpackage.aihd) ((defpackage.kaw) this.e).a).iterator();
                defpackage.aooh.e(it2, "iterator(...)");
                while (it2.hasNext()) {
                    ((defpackage.kau) it2.next()).e();
                }
                return defpackage.aojh.a;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return (java.lang.Boolean) ((defpackage.aoin) this.e).a();
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.unb unbVar = (defpackage.unb) this.e;
                defpackage.aoov.an(unbVar.d, null, 0, new defpackage.ung(unbVar, (defpackage.aoln) null, 1), 3);
                return defpackage.aojh.a;
            case 9:
                defpackage.unb unbVar2 = (defpackage.unb) this.e;
                java.util.List list = (java.util.List) unbVar2.i.c();
                if (list != null) {
                    unbVar2.c.o(defpackage.rmx.FAVORITES_BAR_ORDER_CHANGED);
                    defpackage.aoov.an(unbVar2.d, null, 0, new ufr(unbVar2, list, (defpackage.aoln) null, 14), 3);
                }
                return defpackage.aojh.a;
            default:
                ((defpackage.unb) this.e).h.e(null);
                return defpackage.aojh.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ded(java.lang.Object obj, int i) {
        super(0, obj, defpackage.den.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ded(java.lang.Object obj, int i, char[] cArr) {
        super(0, obj, defpackage.gat.class, "invalidate", "invalidate()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ded(java.lang.Object obj, int i, int[] iArr) {
        super(0, obj, defpackage.gfn.class, "onAutoCloseCallback", "onAutoCloseCallback()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ded(java.lang.Object obj, int i, boolean[] zArr) {
        super(0, obj, defpackage.kaw.class, "onScreenStarted", "onScreenStarted()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ded(java.lang.Object obj, int i, float[] fArr) {
        super(0, obj, defpackage.kaw.class, "onScreenVisible", "onScreenVisible()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ded(java.lang.Object obj, int i, byte[][] bArr) {
        super(0, obj, defpackage.aoin.class, "get", "get()Ljava/lang/Object;", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ded(java.lang.Object obj, int i, char[][] cArr) {
        super(0, obj, defpackage.unb.class, "toggleHideContacts", "toggleHideContacts()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ded(java.lang.Object obj, int i, short[][] sArr) {
        super(0, obj, defpackage.unb.class, "onDrop", "onDrop()V", 0);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ded(java.lang.Object obj, int i, int[][] iArr) {
        super(0, obj, defpackage.unb.class, "onDisambigDialogHandled", "onDisambigDialogHandled()V", 0);
        this.$cid = i;
    }
}
