package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jxw {
    public static final aimz a = aimz.i("com/android/dialer/calllocation/ui/LocationViewPeer");
    public final aoin b;
    public final android.widget.FrameLayout c;
    public final defpackage.aaoh d;
    public final gpd e;
    public uzx f;
    private final aw g;
    private final com.android.dialer.calllocation.ui.LocationView h;
    private final ahey i;
    private final aoin j;
    private final android.widget.TextView k;
    private final android.widget.TextView l;
    private final android.widget.TextView m;
    private final android.widget.TextView n;
    private final android.view.ViewGroup o;
    private final android.widget.ViewAnimator p;
    private final android.widget.TextView q;
    private java.lang.String r;
    private defpackage.jxp s;
    private final zpm t;

    public jxw(aw awVar, com.android.dialer.calllocation.ui.LocationView locationView, aais aaisVar, zpm zpmVar, gpd gpdVar, ahey aheyVar, aoin aoinVar, aoin aoinVar2) {
        aooh.f(awVar, "fragment");
        aooh.f(aaisVar, "sanitizer");
        aooh.f(zpmVar, "callScopes");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(aoinVar, "enableLiteModeFix");
        aooh.f(aoinVar2, "enableMakeMapUnclickableInSetupFix");
        this.g = awVar;
        this.h = locationView;
        this.t = zpmVar;
        this.e = gpdVar;
        this.i = aheyVar;
        this.j = aoinVar;
        this.b = aoinVar2;
        a.b().l("com/android/dialer/calllocation/ui/LocationViewPeer", "<init>", 75, "LocationViewPeer.kt").v("Inflating location view");
        com.android.dialer.calllocation.ui.LocationView.inflate(locationView.getContext(), 2131624303, locationView);
        android.view.View viewFindViewById = locationView.findViewById(2131428502);
        aooh.e(viewFindViewById, "findViewById(...)");
        this.c = (android.widget.FrameLayout) viewFindViewById;
        android.view.View viewFindViewById2 = locationView.findViewById(2131427435);
        aooh.e(viewFindViewById2, "findViewById(...)");
        this.k = (android.widget.TextView) viewFindViewById2;
        android.view.View viewFindViewById3 = locationView.findViewById(2131427436);
        aooh.e(viewFindViewById3, "findViewById(...)");
        this.l = (android.widget.TextView) viewFindViewById3;
        android.view.View viewFindViewById4 = locationView.findViewById(2131428702);
        aooh.e(viewFindViewById4, "findViewById(...)");
        this.m = (android.widget.TextView) viewFindViewById4;
        android.view.View viewFindViewById5 = locationView.findViewById(2131428443);
        aooh.e(viewFindViewById5, "findViewById(...)");
        this.n = (android.widget.TextView) viewFindViewById5;
        android.view.View viewFindViewById6 = locationView.findViewById(2131428476);
        aooh.e(viewFindViewById6, "findViewById(...)");
        this.o = (android.view.ViewGroup) viewFindViewById6;
        android.view.View viewFindViewById7 = locationView.findViewById(2131428482);
        aooh.e(viewFindViewById7, "findViewById(...)");
        this.p = (android.widget.ViewAnimator) viewFindViewById7;
        android.view.View viewFindViewById8 = locationView.findViewById(2131428475);
        aooh.e(viewFindViewById8, "findViewById(...)");
        this.q = (android.widget.TextView) viewFindViewById8;
        com.google.android.gms.maps.GoogleMapOptions googleMapOptions = new com.google.android.gms.maps.GoogleMapOptions();
        googleMapOptions.e = java.lang.Boolean.TRUE;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        googleMapOptions.f = bool;
        googleMapOptions.d = bool;
        googleMapOptions.c = bool;
        googleMapOptions.a = 1;
        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            googleMapOptions.l = 0;
        }
        defpackage.aaoh aaohVar = new defpackage.aaoh(aheyVar, googleMapOptions);
        this.d = aaohVar;
        android.os.Bundle bundle = android.os.Bundle.EMPTY;
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            aaky aakyVar = aaohVar.a;
            aakyVar.b(bundle, new defpackage.aakv(aakyVar, bundle));
            if (aaohVar.a.c == null) {
                aabx aabxVar = aabx.a;
                android.content.Context context = aaohVar.getContext();
                int iK = aabxVar.k(context);
                java.lang.String strC = aagk.c(context, iK);
                java.lang.String strB = aagk.b(context, iK);
                android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(aaohVar.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
                aaohVar.addView(linearLayout);
                android.widget.TextView textView = new android.widget.TextView(aaohVar.getContext());
                textView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
                textView.setText(strC);
                linearLayout.addView(textView);
                android.content.Intent intentM = aabxVar.m(context, iK, (java.lang.String) null);
                if (intentM != null) {
                    android.widget.Button button = new android.widget.Button(context);
                    button.setId(android.R.id.button1);
                    button.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
                    button.setText(strB);
                    linearLayout.addView(button);
                    button.setOnClickListener(new wgf(context, intentM, 3));
                }
            }
            android.os.StrictMode.setThreadPolicy(threadPolicy);
            awVar.Q().P().c(new defpackage.jxv(this));
        } catch (java.lang.Throwable th) {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aaos */
    public final void a(defpackage.jxp jxpVar) throws aaos {
        android.os.IInterface aakzVar;
        uzx uzxVar = this.f;
        if (uzxVar != null) {
            com.google.android.gms.maps.model.LatLng latLng = new com.google.android.gms.maps.model.LatLng(jxpVar.c, jxpVar.d);
            try {
                java.lang.Object obj = uzxVar.a;
                ((ylb) obj).eR(14, ((ylb) obj).eP());
                com.google.android.gms.maps.model.MarkerOptions markerOptions = new com.google.android.gms.maps.model.MarkerOptions();
                markerOptions.a = latLng;
                markerOptions.h = true;
                markerOptions.f = false;
                try {
                    java.lang.Object obj2 = uzxVar.a;
                    android.os.Parcel parcelEP = ((ylb) obj2).eP();
                    yld.d(parcelEP, markerOptions);
                    android.os.Parcel parcelEQ = ((ylb) obj2).eQ(11, parcelEP);
                    android.os.IBinder strongBinder = parcelEQ.readStrongBinder();
                    if (strongBinder != null) {
                        android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                        if (iInterfaceQueryLocalInterface instanceof defpackage.aaou) {
                        }
                    }
                    parcelEQ.recycle();
                    try {
                        aaoj aaojVar = aaoo.b;
                        aais.at(aaojVar, "CameraUpdateFactory is not initialized");
                        android.os.Parcel parcelEP2 = aaojVar.eP();
                        yld.d(parcelEP2, latLng);
                        parcelEP2.writeFloat(15.0f);
                        android.os.Parcel parcelEQ2 = aaojVar.eQ(9, parcelEP2);
                        android.os.IBinder strongBinder2 = parcelEQ2.readStrongBinder();
                        if (strongBinder2 == null) {
                            aakzVar = null;
                        } else {
                            android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                            aakzVar = iInterfaceQueryLocalInterface2 instanceof aalb ? (aalb) iInterfaceQueryLocalInterface2 : new aakz(strongBinder2);
                        }
                        parcelEQ2.recycle();
                        aais.as(aakzVar);
                        try {
                            java.lang.Object obj3 = uzxVar.a;
                            android.os.Parcel parcelEP3 = ((ylb) obj3).eP();
                            yld.f(parcelEP3, aakzVar);
                            ((ylb) obj3).eR(4, parcelEP3);
                        } catch (android.os.RemoteException e) {
                            throw new aaos(e);
                        }
                    } catch (android.os.RemoteException e2) {
                        throw new aaos(e2);
                    }
                } catch (android.os.RemoteException e3) {
                    throw new aaos(e3);
                }
            } catch (android.os.RemoteException e4) {
                throw new aaos(e4);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aaos */
    public final void b(defpackage.jxs jxsVar) throws aaos {
        int i;
        aooh.f(jxsVar, "model");
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/calllocation/ui/LocationViewPeer", "setModel", 107, "LocationViewPeer.kt").y("updating location model to: %s", jxsVar);
        defpackage.jxr jxrVarB = defpackage.jxr.b(jxsVar.f);
        if (jxrVarB == null) {
            jxrVarB = defpackage.jxr.LOCATION_FAILURE_NONE;
        }
        if (jxrVarB == defpackage.jxr.LOCATION_FAILURE_BATTERY_TOO_LOW) {
            android.widget.ViewAnimator viewAnimator = this.p;
            if (viewAnimator.getDisplayedChild() != 2) {
                this.q.setText(this.i.getString(2132019181));
                viewAnimator.setDisplayedChild(2);
                java.lang.String str = jxsVar.e;
                aooh.e(str, "getCallId(...)");
                qbe qbeVarD = d(str);
                if (qbeVarD != null) {
                    qbeVarD.a(qbc.gP);
                    return;
                }
                return;
            }
        }
        if ((jxsVar.b & 2) != 0) {
            java.lang.String str2 = jxsVar.e;
            aooh.e(str2, "getCallId(...)");
            java.lang.String str3 = jxsVar.d;
            aooh.e(str3, "getAddress(...)");
            aimzVar.b().l("com/android/dialer/calllocation/ui/LocationViewPeer", "setAddress", 135, "LocationViewPeer.kt").y("setAddress: %s", aais.aD(str3));
            android.widget.TextView textView = this.k;
            textView.setVisibility(0);
            android.widget.TextView textView2 = this.l;
            textView2.setVisibility(0);
            if (android.text.TextUtils.equals(this.r, str3)) {
                i = 1;
            } else if (android.text.TextUtils.isEmpty(str3)) {
                textView.setText((java.lang.CharSequence) null);
                textView2.setText((java.lang.CharSequence) null);
                i = 1;
            } else {
                int iW = aoov.w(str3, ",", 0, false);
                if (iW >= 0) {
                    java.lang.String strSubstring = str3.substring(0, iW);
                    i = 1;
                    aooh.e(strSubstring, "substring(...)");
                    textView.setText(aoov.x(strSubstring).toString());
                    java.lang.String strSubstring2 = str3.substring(iW + 1);
                    aooh.e(strSubstring2, "substring(...)");
                    textView2.setText(aoov.x(strSubstring2).toString());
                } else {
                    i = 1;
                    textView.setText(str3);
                    textView2.setText((java.lang.CharSequence) null);
                }
                qbe qbeVarD2 = d(str2);
                if (qbeVarD2 != null) {
                    qbeVarD2.a(qbc.gO);
                }
            }
            this.r = str3;
            c();
        } else {
            i = 1;
        }
        if ((jxsVar.b & 1) != 0) {
            if (this.s != null) {
                defpackage.jxp jxpVar = jxsVar.c;
                if (jxpVar == null) {
                    jxpVar = defpackage.jxp.a;
                }
                if (aooh.n(jxpVar, this.s)) {
                    return;
                }
            }
            defpackage.jxp jxpVar2 = jxsVar.c;
            if (jxpVar2 == null) {
                jxpVar2 = defpackage.jxp.a;
            }
            aooh.e(jxpVar2, "getCoordinates(...)");
            aimzVar.b().l("com/android/dialer/calllocation/ui/LocationViewPeer", "setLocationText", 170, "LocationViewPeer.kt").y("location coordinates: %s", aais.aD(jxpVar2));
            com.android.dialer.calllocation.ui.LocationView locationView = this.h;
            android.widget.TextView textView3 = this.n;
            android.content.Context context = locationView.getContext();
            textView3.setVisibility(0);
            java.lang.Double dValueOf = java.lang.Double.valueOf(jxpVar2.c);
            java.lang.Double dValueOf2 = java.lang.Double.valueOf(jxpVar2.d);
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = dValueOf;
            objArr[i] = dValueOf2;
            textView3.setText(context.getString(2132019159, objArr));
            java.lang.String strA = akvp.a(jxpVar2.c, jxpVar2.d);
            android.widget.TextView textView4 = this.m;
            java.lang.Object[] objArr2 = new java.lang.Object[i];
            objArr2[0] = strA;
            textView4.setText(context.getString(2132019768, objArr2));
            textView4.setVisibility(0);
            c();
            java.lang.String str4 = jxsVar.e;
            aooh.e(str4, "getCallId(...)");
            aimzVar.b().l("com/android/dialer/calllocation/ui/LocationViewPeer", "setMap", 185, "LocationViewPeer.kt").v("enter");
            if (this.f != null) {
                a(jxpVar2);
            } else {
                defpackage.aaoh aaohVar = this.d;
                jxt jxtVar = new jxt(this, jxpVar2, str4);
                if (!aais.d()) {
                    throw new java.lang.IllegalStateException("getMapAsync() must be called on the main thread");
                }
                aaky aakyVar = aaohVar.a;
                aaog aaogVar = aakyVar.c;
                if (aaogVar != null) {
                    aaogVar.a(jxtVar);
                } else {
                    aakyVar.d.add(jxtVar);
                }
            }
            if (!((java.lang.Boolean) this.b.a()).booleanValue()) {
                e(null);
            }
            this.s = jxpVar2;
        }
    }

    public final void c() {
        android.widget.ViewAnimator viewAnimator = this.p;
        if (viewAnimator.getDisplayedChild() != 1) {
            viewAnimator.setDisplayedChild(1);
            this.o.setLayoutTransition(new android.animation.LayoutTransition());
        }
    }

    public final qbe d(java.lang.String str) {
        defpackage.jxu jxuVar;
        apqr apqrVar = (apqr) this.t.e(str).orElse((java.lang.Object) null);
        if (apqrVar == null || (jxuVar = (defpackage.jxu) apqrVar.a(defpackage.jxu.class)) == null) {
            return null;
        }
        return jxuVar.cp();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aaos */
    public final void e(uzx uzxVar) throws aaos {
        if (android.provider.Settings.Global.getInt(this.i.getContentResolver(), "device_provisioned", 0) != 1) {
            this.d.setClickable(false);
            if (((java.lang.Boolean) this.b.a()).booleanValue()) {
                this.c.setDescendantFocusability(393216);
                if (uzxVar != null) {
                    try {
                        java.lang.Object obj = uzxVar.a;
                        aaon aaonVar = new aaon(uzxVar);
                        android.os.Parcel parcelEP = ((ylb) obj).eP();
                        yld.f(parcelEP, aaonVar);
                        ((ylb) obj).eR(28, parcelEP);
                    } catch (android.os.RemoteException e) {
                        throw new aaos(e);
                    }
                }
            }
            a.b().l("com/android/dialer/calllocation/ui/LocationViewPeer", "makeMapUnclickableDuringDeviceSetup", 272, "LocationViewPeer.kt").v("Making the MapView unclickable since device is not provisioned yet.");
        }
    }
}
