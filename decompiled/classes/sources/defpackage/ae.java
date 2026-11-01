package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class ae implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ ae(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fb  */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        defpackage.dxe dxeVarD;
        android.content.Context contextA;
        java.lang.Object systemService = null;
        switch (this.$cid) {
            case 0:
                bx.a((java.util.List) this.a, 4);
                return;
            case 1:
                if (defpackage.bo.Z(2)) {
                    android.util.Log.v("FragmentManager", "Transition for all operations has completed");
                }
                java.lang.Object obj = this.a;
                java.util.Iterator it = ((ag) obj).a.iterator();
                while (it.hasNext()) {
                    ((ab) ((ah) it.next())).a.f((ch) obj);
                }
                return;
            case 2:
                defpackage.aomy aomyVar = (defpackage.aomy) ((defpackage.aoot) this.a).a;
                if (aomyVar != null) {
                    aomyVar.a();
                    return;
                }
                return;
            case 3:
                al alVar = (al) this.a;
                alVar.a.onDismiss(alVar.d);
                return;
            case 4:
                ((defpackage.aw) this.a).ad.a(defpackage.emp.ON_DESTROY);
                return;
            case 5:
                ((defpackage.aw) this.a).i();
                return;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.aw) this.a).ad.a(defpackage.emp.ON_STOP);
                return;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.aw) this.a).ab.f(defpackage.emp.ON_STOP);
                return;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                ((defpackage.aw) this.a).m();
                return;
            case 9:
                ((defpackage.aw) this.a).j();
                return;
            case 10:
                ((defpackage.aw) this.a).ad.a(defpackage.emp.ON_PAUSE);
                return;
            case 11:
                ((defpackage.aw) this.a).ab.f(defpackage.emp.ON_PAUSE);
                return;
            case 12:
                ((defpackage.aw) this.a).al();
                return;
            case 13:
                ((defpackage.aw) this.a).ab.f(defpackage.emp.ON_DESTROY);
                return;
            case 14:
                ((defpackage.aw) this.a).ai();
                return;
            case 15:
                ((defpackage.aw) this.a).ac(false);
                return;
            case 16:
                java.util.ArrayList arrayList = ((defpackage.bo) this.a).k;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                }
                return;
            case 17:
                int i2 = defpackage.dc.b;
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    android.content.Context context = (android.content.Context) this.a;
                    android.content.ComponentName componentName = new android.content.ComponentName(context, "android.support.v7.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (android.os.Build.VERSION.SDK_INT >= 33) {
                            defpackage.acb acbVar = new defpackage.acb(defpackage.dc.f);
                            while (acbVar.hasNext()) {
                                defpackage.dc dcVar = (defpackage.dc) ((java.lang.ref.WeakReference) acbVar.next()).get();
                                if (dcVar != null && (contextA = dcVar.a()) != null) {
                                    systemService = contextA.getSystemService("locale");
                                    if (systemService != null) {
                                        dxeVarD = defpackage.dxe.d(ae$.ExternalSyntheticApiModelOutline0.m(ae$.ExternalSyntheticApiModelOutline0.m(systemService)));
                                    } else {
                                        dxeVarD = defpackage.dxe.a;
                                    }
                                }
                            }
                            if (systemService != null) {
                                dxeVarD = defpackage.dxe.d(ae$.ExternalSyntheticApiModelOutline0.m(ae$.ExternalSyntheticApiModelOutline0.m(systemService)));
                            } else {
                                dxeVarD = defpackage.dxe.a;
                            }
                        } else {
                            dxeVarD = defpackage.dc.c;
                            if (dxeVarD == null) {
                                dxeVarD = defpackage.dxe.a;
                            }
                        }
                        if (dxeVarD.g()) {
                            java.lang.String strA = dut.a(context);
                            java.lang.Object systemService2 = context.getSystemService("locale");
                            if (systemService2 != null) {
                                ae$.ExternalSyntheticApiModelOutline0.m(ae$.ExternalSyntheticApiModelOutline0.m(systemService2), aa$.ExternalSyntheticApiModelOutline1.m(strA));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                defpackage.dc.e = true;
                return;
            case 18:
                defpackage.dq dqVar = (defpackage.dq) this.a;
                dqVar.s.showAtLocation(dqVar.r, 55, 0, 0);
                dqVar.E();
                if (!dqVar.N()) {
                    dqVar.r.setAlpha(1.0f);
                    dqVar.r.setVisibility(0);
                    return;
                }
                dqVar.r.setAlpha(0.0f);
                ni niVarO = defpackage.dzs.o(dqVar.r);
                niVarO.k(1.0f);
                dqVar.L = niVarO;
                dqVar.L.m(new de(this));
                return;
            case 19:
                java.lang.Object obj2 = this.a;
                android.view.Menu menuV = ((dy) obj2).v();
                android.view.Menu menu = true != (menuV instanceof defpackage.ft) ? null : menuV;
                if (menu != null) {
                    ((defpackage.ft) menu).u();
                }
                try {
                    menuV.clear();
                    android.view.Window.Callback callback = ((dy) obj2).a;
                    if (!callback.onCreatePanelMenu(0, menuV) || !callback.onPreparePanel(0, null, menuV)) {
                        menuV.clear();
                    }
                    if (menu != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (menu != null) {
                        ((defpackage.ft) menu).t();
                    }
                }
                break;
            default:
                android.support.v7.widget.ActionBarOverlayLayout actionBarOverlayLayout = (android.support.v7.widget.ActionBarOverlayLayout) this.a;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.i = actionBarOverlayLayout.c.animate().translationY(0.0f).setListener(actionBarOverlayLayout.j);
                return;
        }
    }

    public ae(java.lang.Object obj, int i, byte[] bArr) {
        this.$cid = i;
        this.a = obj;
    }
}
