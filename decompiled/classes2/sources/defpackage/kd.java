package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kd implements android.widget.PopupWindow.OnDismissListener {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public kd(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.$cid) {
            case 0:
                rai raiVar = ((defpackage.kf) this.a).f;
                if (raiVar != null) {
                    ((defpackage.mlp) raiVar.a).d = false;
                }
                break;
            case 1:
                ((defpackage.gc) this.a).c();
                break;
            case 2:
                defpackage.kma kmaVar = (defpackage.kma) this.a;
                akzx akzxVarZ = kmaVar.y.z();
                akzxVarZ.u();
                defpackage.knb knbVar = (defpackage.knb) akzxVarZ.b;
                defpackage.knb knbVar2 = defpackage.knb.a;
                knbVar.d = null;
                knbVar.b &= -3;
                kmaVar.C = false;
                break;
            case 3:
                ((android.widget.PopupWindow) this.a).dismiss();
                break;
            case 4:
                ((android.widget.PopupWindow) this.a).dismiss();
                break;
            case 5:
                ackk ackkVar = (ackk) this.a;
                if (ackkVar.ak && ackkVar.e) {
                    ackkVar.ap.v(ackkVar.al, 3);
                }
                ackkVar.b();
                break;
            case 6:
                ackm ackmVar = (ackm) this.a;
                ackmVar.b.b((android.view.View) null);
                android.widget.PopupWindow.OnDismissListener onDismissListener = ackmVar.a.l;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss();
                }
                break;
            case 7:
                ((aggs) this.a).f = null;
                break;
            default:
                aggs aggsVar = (aggs) this.a;
                aggsVar.f = null;
                aggsVar.a();
                aggsVar.e.a();
                break;
        }
    }

    public /* synthetic */ kd(java.lang.Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
