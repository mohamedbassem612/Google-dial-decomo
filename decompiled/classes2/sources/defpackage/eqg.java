package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class eqg {
    public static final /* synthetic */ int R = 0;
    public final int A;
    public final boolean B;
    public final float C;
    public final byte[] D;
    public final int E;
    public final defpackage.epy F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    private int S;
    public final java.lang.String a;
    public final java.lang.String b;
    public final java.util.List c;
    public final java.lang.String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final java.lang.String k;
    public final defpackage.eqy l;
    public final java.lang.Object m;
    public final java.lang.String n;
    public final java.lang.String o;
    public final java.lang.String p;
    public final int q;
    public final int r;
    public final java.util.List s;
    public final androidx.media3.common.DrmInitData t;
    public final long u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final float z;

    static {
        new defpackage.eqg(new defpackage.eqf());
        java.lang.String str = eum.a;
    }

    public eqg(defpackage.eqf eqfVar) {
        boolean z;
        java.lang.String str;
        this.a = eqfVar.a;
        java.lang.String strL = eum.L(eqfVar.d);
        this.d = strL;
        if (eqfVar.c.isEmpty() && eqfVar.b != null) {
            this.c = aify.p(new defpackage.eqi(strL, eqfVar.b));
            this.b = eqfVar.b;
        } else if (eqfVar.c.isEmpty() || eqfVar.b != null) {
            if (!eqfVar.c.isEmpty() || eqfVar.b != null) {
                int i = 0;
                while (true) {
                    if (i >= eqfVar.c.size()) {
                        z = false;
                        break;
                    } else {
                        if (((defpackage.eqi) eqfVar.c.get(i)).b.equals(eqfVar.b)) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                z = true;
                break;
            }
            ahvr.bY(z);
            this.c = eqfVar.c;
            this.b = eqfVar.b;
        } else {
            this.c = eqfVar.c;
            java.util.List list = eqfVar.c;
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((defpackage.eqi) list.get(0)).b;
                    break;
                }
                defpackage.eqi eqiVar = (defpackage.eqi) it.next();
                if (android.text.TextUtils.equals(eqiVar.a, strL)) {
                    str = eqiVar.b;
                    break;
                }
            }
            this.b = str;
        }
        this.e = eqfVar.e;
        ahvr.bZ(eqfVar.g == 0 || (eqfVar.f & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.f = eqfVar.f;
        this.g = eqfVar.g;
        int i2 = eqfVar.h;
        this.h = i2;
        int i3 = eqfVar.i;
        this.i = i3;
        this.j = i3 != -1 ? i3 : i2;
        this.k = eqfVar.j;
        this.l = eqfVar.k;
        this.m = null;
        this.n = eqfVar.l;
        this.o = eqfVar.m;
        this.p = eqfVar.n;
        this.q = eqfVar.o;
        this.r = eqfVar.p;
        java.util.List list2 = eqfVar.q;
        this.s = list2 == null ? java.util.Collections.EMPTY_LIST : list2;
        androidx.media3.common.DrmInitData drmInitData = eqfVar.r;
        this.t = drmInitData;
        this.u = eqfVar.s;
        this.v = eqfVar.t;
        this.w = eqfVar.u;
        this.x = eqfVar.v;
        this.y = eqfVar.w;
        this.z = eqfVar.x;
        int i4 = eqfVar.y;
        this.A = i4 == -1 ? 0 : i4;
        this.B = eqfVar.z;
        float f = eqfVar.A;
        this.C = f == -1.0f ? 1.0f : f;
        this.D = eqfVar.B;
        this.E = eqfVar.C;
        this.F = eqfVar.D;
        this.G = eqfVar.E;
        int i5 = eqfVar.F;
        this.H = i5;
        int i6 = eqfVar.G;
        this.I = i6;
        if (i5 != -1 && i6 != -1) {
            ahvr.cd(java.lang.Integer.bitCount(i6) == i5, "channelCount and channelMask are inconsistent. channelCount=%s, channelMask=%s", i5, i6);
        }
        this.J = eqfVar.H;
        this.K = eqfVar.I;
        int i7 = eqfVar.J;
        this.L = i7 == -1 ? 0 : i7;
        int i8 = eqfVar.K;
        this.M = i8 != -1 ? i8 : 0;
        this.N = eqfVar.L;
        this.O = eqfVar.M;
        this.P = -1;
        int i9 = eqfVar.N;
        this.Q = (i9 != 0 || drmInitData == null) ? i9 : 1;
    }

    public static java.lang.String c(defpackage.eqg eqgVar) {
        java.lang.String str;
        java.lang.String string;
        int i;
        int i2;
        if (eqgVar == null) {
            return "null";
        }
        ahyj ahyjVarD = ahyj.d(',');
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("id=");
        sb.append(eqgVar.a);
        sb.append(", mimeType=");
        sb.append(eqgVar.p);
        java.lang.String str2 = eqgVar.o;
        if (str2 != null) {
            sb.append(", container=");
            sb.append(str2);
        }
        java.lang.String str3 = eqgVar.n;
        if (str3 != null) {
            sb.append(", primaryGroupId=");
            sb.append(str3);
        }
        int i3 = eqgVar.j;
        if (i3 != -1) {
            sb.append(", bitrate=");
            sb.append(i3);
        }
        java.lang.String str4 = eqgVar.k;
        if (str4 != null) {
            sb.append(", codecs=");
            sb.append(str4);
        }
        androidx.media3.common.DrmInitData drmInitData = eqgVar.t;
        if (drmInitData != null) {
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            for (int i4 = 0; i4 < drmInitData.b; i4++) {
                java.util.UUID uuid = drmInitData.a(i4).a;
                if (uuid.equals(defpackage.epx.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(defpackage.epx.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(defpackage.epx.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(defpackage.epx.d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(defpackage.epx.a)) {
                    linkedHashSet.add("universal");
                } else {
                    linkedHashSet.add(a.bG((byte) 41, uuid, "unknown ("));
                }
            }
            sb.append(", drm=[");
            ahyjVarD.h(sb, linkedHashSet);
            sb.append(']');
        }
        int i5 = eqgVar.v;
        if (i5 != -1 && (i2 = eqgVar.w) != -1) {
            sb.append(", res=");
            sb.append(i5);
            sb.append('x');
            sb.append(i2);
        }
        int i6 = eqgVar.x;
        if (i6 != -1 && (i = eqgVar.y) != -1) {
            sb.append(", decRes=");
            sb.append(i6);
            sb.append('x');
            sb.append(i);
        }
        float f = eqgVar.C;
        int i7 = defpackage.aiyu.a;
        double d = f;
        int i8 = 1;
        if (java.lang.Math.copySign((-1.0d) + d, 1.0d) > 0.001d && d != 1.0d) {
            java.lang.Double.isNaN(d);
            sb.append(", par=");
            sb.append(eum.G("%.3f", new java.lang.Object[]{java.lang.Float.valueOf(f)}));
        }
        defpackage.epy epyVar = eqgVar.F;
        if (epyVar != null && (epyVar.f() || epyVar.g())) {
            sb.append(", color=");
            java.lang.String strG = epyVar.g() ? eum.G("%s/%s/%s", new java.lang.Object[]{defpackage.epy.d(epyVar.b), defpackage.epy.c(epyVar.c), defpackage.epy.e(epyVar.d)}) : "NA/NA/NA";
            if (epyVar.f()) {
                int i9 = epyVar.f;
                int i10 = epyVar.g;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(i9);
                sb2.append('/');
                sb2.append(i10);
                string = sb2.toString();
            } else {
                string = "NA/NA";
            }
            sb.append(a.bE(string, (byte) 47, strG));
        }
        float f2 = eqgVar.z;
        if (f2 != -1.0f) {
            sb.append(", fps=");
            sb.append(f2);
        }
        int i11 = eqgVar.A;
        if (i11 != 0) {
            sb.append(", rotation=");
            sb.append(i11);
        }
        if (eqgVar.B) {
            sb.append(", mirrorHorizontal");
        }
        int i12 = eqgVar.G;
        if (i12 != -1) {
            sb.append(", maxSubLayers=");
            sb.append(i12);
        }
        int i13 = eqgVar.H;
        if (i13 != -1) {
            sb.append(", channels=");
            sb.append(i13);
        }
        int i14 = eqgVar.I;
        if (i14 != -1) {
            sb.append(", channel_mask=");
            sb.append(i14);
        }
        int i15 = eqgVar.J;
        if (i15 != -1) {
            sb.append(", sample_rate=");
            sb.append(i15);
        }
        java.lang.String str5 = eqgVar.d;
        if (str5 != null) {
            sb.append(", language=");
            sb.append(str5);
        }
        java.util.List list = eqgVar.c;
        if (!list.isEmpty()) {
            sb.append(", labels=[");
            ahyjVarD.h(sb, ahvr.aO(list, new defpackage.exn(i8)));
            sb.append(']');
        }
        int i16 = eqgVar.e;
        if (i16 != 0) {
            sb.append(", selectionFlags=[");
            java.lang.String str6 = eum.a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if ((i16 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i16 & 2) != 0) {
                arrayList.add("forced");
            }
            ahyjVarD.h(sb, arrayList);
            sb.append(']');
        }
        int i17 = eqgVar.f;
        if (i17 != 0) {
            sb.append(", roleFlags=[");
            int i18 = i17 & 32768;
            java.lang.String str7 = eum.a;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if ((i17 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i17 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i17 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i17 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i17 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i17 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i17 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i17 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i17 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i17 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i17 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i17 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i17 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i17 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i17 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if (i18 != 0) {
                arrayList2.add("auxiliary");
            }
            ahyjVarD.h(sb, arrayList2);
            sb.append(']');
        }
        if ((i17 & 32768) != 0) {
            sb.append(", auxiliaryTrackType=");
            int i19 = eqgVar.g;
            java.lang.String str8 = eum.a;
            if (i19 == 0) {
                str = "undefined";
            } else if (i19 == 1) {
                str = "original";
            } else if (i19 == 2) {
                str = "depth-linear";
            } else if (i19 == 3) {
                str = "depth-inverse";
            } else {
                if (i19 != 4) {
                    throw new java.lang.IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public final int a() {
        int i;
        int i2 = this.v;
        if (i2 == -1 || (i = this.w) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final defpackage.eqg b(int i) {
        defpackage.eqf eqfVar = new defpackage.eqf(this);
        eqfVar.N = i;
        return new defpackage.eqg(eqfVar);
    }

    public final boolean d(defpackage.eqg eqgVar) {
        java.util.List list = this.s;
        int size = list.size();
        java.util.List list2 = eqgVar.s;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!java.util.Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(java.lang.Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.eqg eqgVar = (defpackage.eqg) obj;
            int i2 = this.S;
            if ((i2 == 0 || (i = eqgVar.S) == 0 || i2 == i) && this.e == eqgVar.e && this.f == eqgVar.f && this.g == eqgVar.g && this.h == eqgVar.h && this.i == eqgVar.i && this.q == eqgVar.q && this.u == eqgVar.u && this.v == eqgVar.v && this.w == eqgVar.w && this.x == eqgVar.x && this.y == eqgVar.y && this.A == eqgVar.A && this.B == eqgVar.B && this.E == eqgVar.E && this.G == eqgVar.G && this.H == eqgVar.H && this.I == eqgVar.I && this.J == eqgVar.J && this.K == eqgVar.K && this.L == eqgVar.L && this.M == eqgVar.M && this.N == eqgVar.N && this.Q == eqgVar.Q && java.lang.Float.compare(this.z, eqgVar.z) == 0 && java.lang.Float.compare(this.C, eqgVar.C) == 0 && j$.util.Objects.equals(this.a, eqgVar.a) && j$.util.Objects.equals(this.b, eqgVar.b) && this.c.equals(eqgVar.c) && j$.util.Objects.equals(this.k, eqgVar.k) && j$.util.Objects.equals(this.n, eqgVar.n) && j$.util.Objects.equals(this.o, eqgVar.o) && j$.util.Objects.equals(this.p, eqgVar.p) && j$.util.Objects.equals(this.d, eqgVar.d) && java.util.Arrays.equals(this.D, eqgVar.D) && j$.util.Objects.equals(this.l, eqgVar.l) && j$.util.Objects.equals(this.F, eqgVar.F) && j$.util.Objects.equals(this.t, eqgVar.t) && d(eqgVar) && j$.util.Objects.equals((java.lang.Object) null, (java.lang.Object) null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.S;
        if (i != 0) {
            return i;
        }
        java.lang.String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.b;
        int iHashCode2 = ((((iHashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + this.c.hashCode();
        java.lang.String str3 = this.d;
        int iHashCode3 = ((((((((((((((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31) - 1082130432) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31;
        java.lang.String str4 = this.k;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        defpackage.eqy eqyVar = this.l;
        int iHashCode5 = iHashCode4 + (eqyVar == null ? 0 : eqyVar.hashCode());
        java.lang.String str5 = this.n;
        int iHashCode6 = ((iHashCode5 * 961) + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.o;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.p;
        int iHashCode8 = ((((((((((((((((((((((((((((((((((((((((((((((iHashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.q) * 31) + ((int) this.u)) * 31) + this.v) * 31) + this.w) * 31) - 1) * 31) + this.x) * 31) + this.y) * 31) + java.lang.Float.floatToIntBits(this.z)) * 31) + this.A) * 31) + (this.B ? 1 : 0)) * 31) + java.lang.Float.floatToIntBits(this.C)) * 31) + this.E) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) - 1) * 31) - 1) * 31) + this.Q;
        this.S = iHashCode8;
        return iHashCode8;
    }

    public final java.lang.String toString() {
        return "Format(" + this.a + ", " + this.b + ", " + this.o + ", " + this.p + ", " + this.k + ", " + this.j + ", " + this.d + ", [" + this.v + ", " + this.w + ", " + this.z + ", " + java.lang.String.valueOf(this.F) + "], [" + this.H + ", " + this.I + ", " + this.J + "])";
    }
}
