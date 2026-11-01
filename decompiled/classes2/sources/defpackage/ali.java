package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ali implements cbm {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public ali(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [aomy, java.lang.Object] */
    public final void a() {
        switch (this.$cid) {
            case 0:
                ((alg) this.a).k();
                break;
            case 1:
                ((defpackage.akr) this.a).r(null);
                break;
            case 2:
                defpackage.bhq bhqVar = (defpackage.bhq) this.a;
                clk clkVar = bhqVar.c;
                clkVar.e();
                clkVar.a();
                android.view.ActionMode actionMode = bhqVar.f;
                if (actionMode != null) {
                    actionMode.finish();
                }
                bhqVar.f = null;
                break;
            case 3:
                defpackage.biq biqVarA = ((defpackage.bis) this.a).a();
                if (biqVarA != null) {
                    biqVarA.a();
                }
                break;
            case 4:
                defpackage.blw blwVar = (defpackage.blw) this.a;
                blwVar.n();
                blwVar.r(false);
                break;
            case 5:
                defpackage.brq brqVar = (defpackage.brq) this.a;
                brqVar.dismiss();
                brqVar.a.g();
                break;
            case 6:
                aosb aosbVar = ((defpackage.bwj) this.a).c;
                if (aosbVar != null) {
                    aosbVar.g((java.lang.Throwable) null);
                }
                break;
            case 7:
                defpackage.drk drkVar = (defpackage.drk) this.a;
                drkVar.dismiss();
                drkVar.c.g();
                break;
            case 8:
                java.lang.Object obj = this.a;
                ((ddl) obj).g();
                android.view.View view = (android.view.View) obj;
                dzo.l(view, (emx) null);
                dzl.j(view, (fxz) null);
                defpackage.drq drqVar = (defpackage.drq) obj;
                drqVar.c.removeViewImmediate(view);
                fxy fxyVar = drqVar.j;
                fxyVar.c();
                boolean z = true;
                fxyVar.a = true;
                aojw aojwVar = new aojw();
                aojwVar.addLast(fxyVar);
                while (!aojwVar.isEmpty()) {
                    fxy fxyVar2 = (fxy) aojwVar.removeFirst();
                    fxyVar2.a = z;
                    ads adsVar = (ads) fxyVar2.e;
                    java.lang.Object[] objArr = adsVar.b;
                    long[] jArr = adsVar.c;
                    int i = adsVar.e;
                    while (i != Integer.MAX_VALUE) {
                        long j = (jArr[i] >> 31) & 2147483647L;
                        aojwVar.addLast((fxy) objArr[i]);
                        i = (int) j;
                    }
                    ads adsVar2 = (ads) fxyVar2.g;
                    ads adsVarAa = defpackage.hgu.aa(adsVar2);
                    java.lang.Object[] objArr2 = adsVarAa.b;
                    long[] jArr2 = adsVarAa.c;
                    int i2 = adsVarAa.e;
                    while (i2 != Integer.MAX_VALUE) {
                        long j2 = (jArr2[i2] >> 31) & 2147483647L;
                        ((fye) fxyVar.d).d((fyd) objArr2[i2]);
                        i2 = (int) j2;
                    }
                    adsVar2.c();
                    ads adsVar3 = (ads) fxyVar2.f;
                    ads adsVarAa2 = defpackage.hgu.aa(adsVar3);
                    java.lang.Object[] objArr3 = adsVarAa2.b;
                    long[] jArr3 = adsVarAa2.c;
                    int i3 = adsVarAa2.e;
                    while (i3 != Integer.MAX_VALUE) {
                        long j3 = (jArr3[i3] >> 31) & 2147483647L;
                        ((fya) objArr3[i3]).f();
                        i3 = (int) j3;
                    }
                    adsVar3.c();
                    adsVar.c();
                    java.lang.Object obj2 = fxyVar2.c;
                    fxyVar2.c = null;
                    z = true;
                }
                break;
            case 9:
                ((fya) this.a).f();
                break;
            case 10:
                ((ykq) this.a).d = null;
                break;
            default:
                this.a.a();
                break;
        }
    }
}
