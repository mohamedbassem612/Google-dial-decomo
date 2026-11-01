package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class flf implements defpackage.flm {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 16, 15, 14, 17, 18, 19, 20, 21, 7};
    private static final defpackage.kvt j;
    private static final defpackage.kvt k;
    private boolean c;
    private int d;
    private aify e;
    private int h;
    private int i;
    private defpackage.frr g = new defpackage.frq(1);
    private boolean f = true;

    static {
        final int i = 1;
        j = new defpackage.kvt(new defpackage.fle() { // from class: fld
            @Override // defpackage.fle
            public final java.lang.reflect.Constructor a() {
                if (i == 0) {
                    int i2 = defpackage.flf.a;
                    return java.lang.Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(defpackage.flj.class).getConstructor(null);
                }
                int i3 = defpackage.flf.a;
                if (java.lang.Boolean.TRUE.equals(java.lang.Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return java.lang.Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(defpackage.flj.class).getConstructor(java.lang.Integer.TYPE);
                }
                return null;
            }
        });
        final int i2 = 0;
        k = new defpackage.kvt(new defpackage.fle() { // from class: fld
            @Override // defpackage.fle
            public final java.lang.reflect.Constructor a() {
                if (i2 == 0) {
                    int i3 = defpackage.flf.a;
                    return java.lang.Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(defpackage.flj.class).getConstructor(null);
                }
                int i4 = defpackage.flf.a;
                if (java.lang.Boolean.TRUE.equals(java.lang.Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return java.lang.Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(defpackage.flj.class).getConstructor(java.lang.Integer.TYPE);
                }
                return null;
            }
        });
    }

    private final void h(int i, java.util.List list) {
        switch (i) {
            case 0:
                list.add(new defpackage.ftr(1, null));
                break;
            case 1:
                list.add(new defpackage.ftr(0));
                break;
            case 2:
                list.add(new defpackage.ftt(this.c ? 1 : 0));
                break;
            case 3:
                list.add(new defpackage.fmp((this.d | (this.c ? 1 : 0)) == true ? 1 : 0));
                break;
            case 4:
                defpackage.flj fljVarK = j.k(0);
                if (fljVarK == null) {
                    list.add(new defpackage.fnc());
                } else {
                    list.add(fljVarK);
                }
                break;
            case 5:
                list.add(new defpackage.fne());
                break;
            case 6:
                list.add(new defpackage.fpe(this.g, true == this.f ? 0 : 2));
                break;
            case 7:
                list.add(new defpackage.fpj(this.c ? 1 : 0));
                break;
            case 8:
                list.add(new defpackage.fqe(this.g, (true != this.f ? 32 : 0) | 512));
                list.add(new defpackage.fqi(this.g, true != this.f ? 16 : 0));
                break;
            case 9:
                list.add(new defpackage.fqw());
                break;
            case 10:
                list.add(new defpackage.fur());
                break;
            case 11:
                if (this.e == null) {
                    this.e = aike.a;
                }
                list.add(new defpackage.fuz(!this.f ? 1 : 0, this.g, new defpackage.euk(0L), new defpackage.vk(this.e, (char[]) null)));
                break;
            case 12:
                list.add(new defpackage.fvg());
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                list.add(new defpackage.fnk(this.h, 0));
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                defpackage.flj fljVarK2 = k.k(new java.lang.Object[0]);
                if (fljVarK2 != null) {
                    list.add(fljVarK2);
                }
                break;
            case 16:
                list.add(new defpackage.fms(!this.f ? 1 : 0, this.g));
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                list.add(new defpackage.fmz(2, (byte[]) null));
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                list.add(new defpackage.fvk(0));
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                list.add(new defpackage.fmz(0));
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_RIGHT /* 20 */:
                list.add(new defpackage.fnk(this.i, 1, null));
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_OFF_RAMP_SLIGHT_LEFT /* 21 */:
                list.add(new defpackage.fvk(1, null));
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:204:0x0333  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.flm
    public final synchronized defpackage.flj[] a(android.net.Uri uri, java.util.Map map) {
        java.util.ArrayList arrayList;
        int i;
        int i2;
        arrayList = new java.util.ArrayList(21);
        java.util.List list = (java.util.List) map.get("Content-Type");
        java.lang.String str = null;
        if (list != null && !list.isEmpty()) {
            str = (java.lang.String) list.get(0);
        }
        if (str != null) {
            java.lang.String strD = defpackage.eqz.d(str);
            switch (strD.hashCode()) {
                case -2123537834:
                    if (strD.equals("audio/eac3-joc")) {
                        i = 0;
                    } else {
                        i = -1;
                    }
                    break;
                case -1662384011:
                    if (strD.equals("video/mp2p")) {
                        i = 10;
                    } else {
                        i = -1;
                    }
                    break;
                case -1662384007:
                    if (strD.equals("video/mp2t")) {
                        i = 11;
                    } else {
                        i = -1;
                    }
                    break;
                case -1662095187:
                    if (strD.equals("video/webm")) {
                        i = 6;
                    } else {
                        i = -1;
                    }
                    break;
                case -1606874997:
                    if (strD.equals("audio/amr-wb")) {
                        i = 3;
                    } else {
                        i = -1;
                    }
                    break;
                case -1487656890:
                    if (strD.equals("image/avif")) {
                        i = 21;
                    } else {
                        i = -1;
                    }
                    break;
                case -1487464693:
                    if (strD.equals("image/heic")) {
                        i = 20;
                    } else {
                        i = -1;
                    }
                    break;
                case -1487464690:
                    if (strD.equals("image/heif")) {
                        i = 20;
                    } else {
                        i = -1;
                    }
                    break;
                case -1487394660:
                    if (strD.equals("image/jpeg")) {
                        i = 14;
                    } else {
                        i = -1;
                    }
                    break;
                case -1487018032:
                    if (strD.equals("image/webp")) {
                        i = 18;
                    } else {
                        i = -1;
                    }
                    break;
                case -1248337486:
                    if (strD.equals("application/mp4")) {
                        i = 8;
                    } else {
                        i = -1;
                    }
                    break;
                case -1079884372:
                    if (strD.equals("video/x-msvideo")) {
                        i = 16;
                    } else {
                        i = -1;
                    }
                    break;
                case -1004728940:
                    if (strD.equals("text/vtt")) {
                        i = 13;
                    } else {
                        i = -1;
                    }
                    break;
                case -879272239:
                    if (strD.equals("image/bmp")) {
                        i = 19;
                    } else {
                        i = -1;
                    }
                    break;
                case -879258763:
                    if (strD.equals("image/png")) {
                        i = 17;
                    } else {
                        i = -1;
                    }
                    break;
                case -387023398:
                    if (strD.equals("audio/x-matroska")) {
                        i = 6;
                    } else {
                        i = -1;
                    }
                    break;
                case -43467528:
                    if (strD.equals("application/webm")) {
                        i = 6;
                    } else {
                        i = -1;
                    }
                    break;
                case 13915911:
                    if (strD.equals("video/x-flv")) {
                        i = 5;
                    } else {
                        i = -1;
                    }
                    break;
                case 187078296:
                    if (strD.equals("audio/ac3")) {
                        i = 0;
                    } else {
                        i = -1;
                    }
                    break;
                case 187078297:
                    if (strD.equals("audio/ac4")) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    break;
                case 187078669:
                    if (strD.equals("audio/amr")) {
                        i = 3;
                    } else {
                        i = -1;
                    }
                    break;
                case 187090232:
                    if (strD.equals("audio/mp4")) {
                        i = 8;
                    } else {
                        i = -1;
                    }
                    break;
                case 187091926:
                    if (strD.equals("audio/ogg")) {
                        i = 9;
                    } else {
                        i = -1;
                    }
                    break;
                case 187099443:
                    if (strD.equals("audio/wav")) {
                        i = 12;
                    } else {
                        i = -1;
                    }
                    break;
                case 1331848029:
                    if (strD.equals("video/mp4")) {
                        i = 8;
                    } else {
                        i = -1;
                    }
                    break;
                case 1503095341:
                    if (strD.equals("audio/3gpp")) {
                        i = 3;
                    } else {
                        i = -1;
                    }
                    break;
                case 1504578661:
                    if (strD.equals("audio/eac3")) {
                        i = 0;
                    } else {
                        i = -1;
                    }
                    break;
                case 1504619009:
                    if (strD.equals("audio/flac")) {
                        i = 4;
                    } else {
                        i = -1;
                    }
                    break;
                case 1504824762:
                    if (strD.equals("audio/midi")) {
                        i = 15;
                    } else {
                        i = -1;
                    }
                    break;
                case 1504831518:
                    if (strD.equals("audio/mpeg")) {
                        i = 7;
                    } else {
                        i = -1;
                    }
                    break;
                case 1505118770:
                    if (strD.equals("audio/webm")) {
                        i = 6;
                    } else {
                        i = -1;
                    }
                    break;
                case 2039520277:
                    if (strD.equals("video/x-matroska")) {
                        i = 6;
                    } else {
                        i = -1;
                    }
                    break;
                default:
                    i = -1;
                    break;
            }
        } else {
            i = -1;
        }
        if (i != -1) {
            h(i, arrayList);
        }
        java.lang.String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            java.lang.String strP = ahvr.p(lastPathSegment);
            if (strP.endsWith(".ac3") || strP.endsWith(".ec3")) {
                i2 = 0;
            } else if (strP.endsWith(".ac4")) {
                i2 = 1;
            } else if (strP.endsWith(".adts") || strP.endsWith(".aac")) {
                i2 = 2;
            } else if (strP.endsWith(".amr")) {
                i2 = 3;
            } else if (strP.endsWith(".flac")) {
                i2 = 4;
            } else if (strP.endsWith(".flv")) {
                i2 = 5;
            } else if (strP.endsWith(".mid") || strP.endsWith(".midi") || strP.endsWith(".smf")) {
                i2 = 15;
            } else if (strP.startsWith(".mk", strP.length() - 4) || strP.endsWith(".webm")) {
                i2 = 6;
            } else if (strP.endsWith(".mp3")) {
                i2 = 7;
            } else if (strP.endsWith(".mp4") || strP.startsWith(".m4", strP.length() - 4) || strP.startsWith(".mp4", strP.length() - 5) || strP.startsWith(".cmf", strP.length() - 5)) {
                i2 = 8;
            } else if (strP.startsWith(".og", strP.length() - 4) || strP.endsWith(".opus")) {
                i2 = 9;
            } else if (strP.endsWith(".ps") || strP.endsWith(".mpeg") || strP.endsWith(".mpg") || strP.endsWith(".m2p")) {
                i2 = 10;
            } else if (strP.endsWith(".ts") || strP.startsWith(".ts", strP.length() - 4)) {
                i2 = 11;
            } else if (strP.endsWith(".wav") || strP.endsWith(".wave")) {
                i2 = 12;
            } else if (strP.endsWith(".vtt") || strP.endsWith(".webvtt")) {
                i2 = 13;
            } else if (strP.endsWith(".jpg") || strP.endsWith(".jpeg")) {
                i2 = 14;
            } else if (strP.endsWith(".avi")) {
                i2 = 16;
            } else if (strP.endsWith(".png")) {
                i2 = 17;
            } else if (strP.endsWith(".webp")) {
                i2 = 18;
            } else if (strP.endsWith(".bmp") || strP.endsWith(".dib")) {
                i2 = 19;
            } else if (strP.endsWith(".heic") || strP.endsWith(".heif")) {
                i2 = 20;
            } else if (strP.endsWith(".avif")) {
                i2 = 21;
            } else {
                i2 = -1;
            }
        } else {
            i2 = -1;
        }
        if (i2 != -1 && i2 != i) {
            h(i2, arrayList);
        }
        int[] iArr = b;
        for (int i3 = 0; i3 < 21; i3++) {
            int i4 = iArr[i3];
            if (i4 != i && i4 != i2) {
                h(i4, arrayList);
            }
        }
        return (defpackage.flj[]) arrayList.toArray(new defpackage.flj[0]);
    }

    @java.lang.Deprecated
    public final synchronized void b(boolean z) {
        this.f = z;
    }

    public final synchronized void c() {
        this.d = 4;
    }

    public final synchronized void d() {
        this.c = true;
    }

    public final synchronized void e() {
        this.i = 1;
    }

    public final synchronized void f() {
        this.h = 1;
    }

    public final synchronized void g(defpackage.frr frrVar) {
        this.g = frrVar;
    }
}
