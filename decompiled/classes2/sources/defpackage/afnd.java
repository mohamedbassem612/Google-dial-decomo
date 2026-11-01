package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class afnd implements aonn {
    public final /* synthetic */ com.google.android.libraries.user.profile.photopicker.components.googlephotos.GooglePhotosBottomSheetActivity a;
    public final /* synthetic */ android.accounts.Account b;
    public final /* synthetic */ akpg c;
    public final /* synthetic */ akoq d;

    public /* synthetic */ afnd(com.google.android.libraries.user.profile.photopicker.components.googlephotos.GooglePhotosBottomSheetActivity googlePhotosBottomSheetActivity, android.accounts.Account account, akpg akpgVar, akoq akoqVar) {
        this.a = googlePhotosBottomSheetActivity;
        this.b = account;
        this.c = akpgVar;
        this.d = akoqVar;
    }

    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        bor borVarU;
        cav cavVar = (cav) obj;
        int iIntValue = ((java.lang.Integer) obj2).intValue();
        int i = iIntValue & 3;
        if (cavVar.H(i != 2, iIntValue & 1)) {
            com.google.android.libraries.user.profile.photopicker.components.googlephotos.GooglePhotosBottomSheetActivity googlePhotosBottomSheetActivity = this.a;
            if (den.bg(cavVar)) {
                android.content.Context applicationContext = googlePhotosBottomSheetActivity.getApplicationContext();
                aooh.e(applicationContext, "getApplicationContext(...)");
                aooh.f(applicationContext, "context");
                if (!a.n()) {
                    borVarU = abrz.s(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535);
                } else if (android.os.Build.VERSION.SDK_INT >= 34) {
                    int[] iArr = defpackage.bso.b;
                    android.content.res.Resources.Theme theme = applicationContext.getTheme();
                    if (theme == null) {
                        theme = applicationContext.getResources().newTheme();
                    }
                    android.content.res.TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(2132086247, iArr);
                    try {
                        borVarU = bos.g(rd.i(typedArrayObtainStyledAttributes, 21), rd.i(typedArrayObtainStyledAttributes, 5), rd.i(typedArrayObtainStyledAttributes, 22), rd.i(typedArrayObtainStyledAttributes, 6), rd.i(typedArrayObtainStyledAttributes, 2), rd.i(typedArrayObtainStyledAttributes, 25), rd.i(typedArrayObtainStyledAttributes, 9), rd.i(typedArrayObtainStyledAttributes, 26), rd.i(typedArrayObtainStyledAttributes, 10), rd.i(typedArrayObtainStyledAttributes, 39), rd.i(typedArrayObtainStyledAttributes, 15), rd.i(typedArrayObtainStyledAttributes, 40), rd.i(typedArrayObtainStyledAttributes, 16), rd.i(typedArrayObtainStyledAttributes, 0), rd.i(typedArrayObtainStyledAttributes, 4), rd.i(typedArrayObtainStyledAttributes, 29), rd.i(typedArrayObtainStyledAttributes, 13), rd.i(typedArrayObtainStyledAttributes, 38), rd.i(typedArrayObtainStyledAttributes, 14), rd.i(typedArrayObtainStyledAttributes, 37), rd.i(typedArrayObtainStyledAttributes, 3), rd.i(typedArrayObtainStyledAttributes, 1), rd.i(typedArrayObtainStyledAttributes, 19), rd.i(typedArrayObtainStyledAttributes, 20), 0L, rd.i(typedArrayObtainStyledAttributes, 30), rd.i(typedArrayObtainStyledAttributes, 31), rd.i(typedArrayObtainStyledAttributes, 32), rd.i(typedArrayObtainStyledAttributes, 33), rd.i(typedArrayObtainStyledAttributes, 34), rd.i(typedArrayObtainStyledAttributes, 35), rd.i(typedArrayObtainStyledAttributes, 36), rd.i(typedArrayObtainStyledAttributes, 23), rd.i(typedArrayObtainStyledAttributes, 24), rd.i(typedArrayObtainStyledAttributes, 7), rd.i(typedArrayObtainStyledAttributes, 8), rd.i(typedArrayObtainStyledAttributes, 27), rd.i(typedArrayObtainStyledAttributes, 28), rd.i(typedArrayObtainStyledAttributes, 11), rd.i(typedArrayObtainStyledAttributes, 12), rd.i(typedArrayObtainStyledAttributes, 41), rd.i(typedArrayObtainStyledAttributes, 42), rd.i(typedArrayObtainStyledAttributes, 17), rd.i(typedArrayObtainStyledAttributes, 18), 331350016);
                        typedArrayObtainStyledAttributes.recycle();
                    } catch (java.lang.Throwable th) {
                        typedArrayObtainStyledAttributes.recycle();
                        throw th;
                    }
                } else {
                    defpackage.bvy bvyVarK = rd.k(applicationContext);
                    long j = bvyVarK.x;
                    long j2 = bvyVarK.A;
                    long j3 = bvyVarK.z;
                    long j4 = bvyVarK.w;
                    long j5 = bvyVarK.y;
                    long j6 = bvyVarK.E;
                    long j7 = bvyVarK.H;
                    long j8 = bvyVarK.G;
                    long j9 = bvyVarK.D;
                    long j10 = bvyVarK.L;
                    long j11 = bvyVarK.O;
                    long j12 = bvyVarK.N;
                    long j13 = bvyVarK.K;
                    long j14 = bvyVarK.s;
                    long j15 = bvyVarK.g;
                    long j16 = bvyVarK.l;
                    borVarU = bos.g(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j14, j15, j16, bvyVarK.i, j, j15, bvyVarK.o, bvyVarK.j, j16, bvyVarK.u, bvyVarK.m, bvyVarK.q, bvyVarK.p, bvyVarK.n, bvyVarK.r, bvyVarK.t, j14, j4, j, bvyVarK.B, j3, j9, j6, bvyVarK.I, j8, j13, j10, bvyVarK.P, j12, 62914560);
                }
            } else {
                android.content.Context applicationContext2 = googlePhotosBottomSheetActivity.getApplicationContext();
                aooh.e(applicationContext2, "getApplicationContext(...)");
                aooh.f(applicationContext2, "context");
                if (!a.n()) {
                    borVarU = abrz.u(0L, 0L, 0L, -69732539262042112L, 0L, 0L, 0L, 0L, -71975719076364288L, 0L, 0L, 0L, -67745159109935104L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -32619108382015488L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -33558793, 65535);
                } else if (android.os.Build.VERSION.SDK_INT >= 34) {
                    int[] iArr2 = defpackage.bso.b;
                    android.content.res.Resources.Theme theme2 = applicationContext2.getTheme();
                    if (theme2 == null) {
                        theme2 = applicationContext2.getResources().newTheme();
                    }
                    android.content.res.TypedArray typedArrayObtainStyledAttributes2 = theme2.obtainStyledAttributes(2132086248, iArr2);
                    try {
                        borVarU = bos.f(rd.i(typedArrayObtainStyledAttributes2, 21), rd.i(typedArrayObtainStyledAttributes2, 5), rd.i(typedArrayObtainStyledAttributes2, 22), rd.i(typedArrayObtainStyledAttributes2, 6), rd.i(typedArrayObtainStyledAttributes2, 2), rd.i(typedArrayObtainStyledAttributes2, 25), rd.i(typedArrayObtainStyledAttributes2, 9), rd.i(typedArrayObtainStyledAttributes2, 26), rd.i(typedArrayObtainStyledAttributes2, 10), rd.i(typedArrayObtainStyledAttributes2, 39), rd.i(typedArrayObtainStyledAttributes2, 15), rd.i(typedArrayObtainStyledAttributes2, 40), rd.i(typedArrayObtainStyledAttributes2, 16), rd.i(typedArrayObtainStyledAttributes2, 0), rd.i(typedArrayObtainStyledAttributes2, 4), rd.i(typedArrayObtainStyledAttributes2, 29), rd.i(typedArrayObtainStyledAttributes2, 13), rd.i(typedArrayObtainStyledAttributes2, 38), rd.i(typedArrayObtainStyledAttributes2, 14), rd.i(typedArrayObtainStyledAttributes2, 37), rd.i(typedArrayObtainStyledAttributes2, 3), rd.i(typedArrayObtainStyledAttributes2, 1), 0L, rd.i(typedArrayObtainStyledAttributes2, 19), rd.i(typedArrayObtainStyledAttributes2, 20), 0L, rd.i(typedArrayObtainStyledAttributes2, 30), rd.i(typedArrayObtainStyledAttributes2, 31), rd.i(typedArrayObtainStyledAttributes2, 32), rd.i(typedArrayObtainStyledAttributes2, 33), rd.i(typedArrayObtainStyledAttributes2, 34), rd.i(typedArrayObtainStyledAttributes2, 35), rd.i(typedArrayObtainStyledAttributes2, 36), rd.i(typedArrayObtainStyledAttributes2, 23), rd.i(typedArrayObtainStyledAttributes2, 24), rd.i(typedArrayObtainStyledAttributes2, 7), rd.i(typedArrayObtainStyledAttributes2, 8), rd.i(typedArrayObtainStyledAttributes2, 27), rd.i(typedArrayObtainStyledAttributes2, 28), rd.i(typedArrayObtainStyledAttributes2, 11), rd.i(typedArrayObtainStyledAttributes2, 12), rd.i(typedArrayObtainStyledAttributes2, 41), rd.i(typedArrayObtainStyledAttributes2, 42), rd.i(typedArrayObtainStyledAttributes2, 17), rd.i(typedArrayObtainStyledAttributes2, 18), 331350016, 0);
                        typedArrayObtainStyledAttributes2.recycle();
                    } catch (java.lang.Throwable th2) {
                        typedArrayObtainStyledAttributes2.recycle();
                        throw th2;
                    }
                } else {
                    defpackage.bvy bvyVarK2 = rd.k(applicationContext2);
                    long j17 = bvyVarK2.y;
                    long j18 = bvyVarK2.v;
                    long j19 = bvyVarK2.w;
                    long j20 = bvyVarK2.B;
                    long j21 = bvyVarK2.x;
                    long j22 = bvyVarK2.F;
                    long j23 = bvyVarK2.C;
                    long j24 = bvyVarK2.D;
                    long j25 = bvyVarK2.I;
                    long j26 = bvyVarK2.M;
                    long j27 = bvyVarK2.J;
                    long j28 = bvyVarK2.K;
                    long j29 = bvyVarK2.P;
                    long j30 = bvyVarK2.b;
                    long j31 = bvyVarK2.r;
                    long j32 = bvyVarK2.g;
                    borVarU = bos.f(j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j30, j31, j32, bvyVarK2.l, j17, bvyVarK2.o, bvyVarK2.d, 0L, bvyVarK2.k, bvyVarK2.i, bvyVarK2.u, j30, bvyVarK2.e, bvyVarK2.f, j32, bvyVarK2.c, bvyVarK2.a, bvyVarK2.h, j19, j21, j20, bvyVarK2.z, j24, bvyVarK2.E, j25, bvyVarK2.G, j28, bvyVarK2.L, j29, bvyVarK2.N, 62914560, 0);
                }
            }
            bor borVar = borVarU;
            abrz.o(borVar, (bti) null, (bwo) null, cfo.j(-1418518402, new defpackage.bit(googlePhotosBottomSheetActivity, this.b, this.c, this.d, 12), cavVar), cavVar, 3072);
        } else {
            cavVar.s();
        }
        return aojh.a;
    }
}
