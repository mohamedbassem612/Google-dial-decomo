package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ekq {
    private static final byte[] A;
    private static final byte[] B;
    private static final java.text.SimpleDateFormat C;
    private static final java.text.SimpleDateFormat D;
    private static final java.util.HashMap[] E;
    private static final java.util.HashMap[] F;
    private static final java.util.Set G;
    private static final java.util.HashMap H;
    private static final byte[] I;
    public static final int[] a;
    private static final ahox[] ad;
    private static final ahox[] ae;
    private static final ahox[] af;
    private static final ahox[] ag;
    private static final ahox[] ah;
    private static final ahox ai;
    private static final ahox[] aj;
    private static final ahox[] ak;
    private static final ahox[] al;
    private static final ahox[] am;
    private static final ahox[] an;
    public static final int[] b;
    static final byte[] c;
    static final byte[] d;
    public static final java.lang.String[] e;
    public static final int[] f;
    public static final byte[] g;
    public static final java.nio.charset.Charset h;
    static final byte[] i;
    static final ahox[][] j;
    private static final boolean k = android.util.Log.isLoggable("ExifInterface", 3);
    private static final byte[] l;
    private static final byte[] m;
    private static final byte[] n;
    private static final byte[] o;
    private static final byte[] p;
    private static final byte[] q;
    private static final byte[] r;
    private static final byte[] s;
    private static final byte[] t;
    private static final byte[] u;
    private static final byte[] v;
    private static final byte[] w;
    private static final byte[] x;
    private static final byte[] y;
    private static final byte[] z;
    private java.lang.String J;
    private java.io.FileDescriptor K;
    private android.content.res.AssetManager.AssetInputStream L;
    private int M;
    private final java.util.HashMap[] N;
    private final java.util.Set O;
    private java.nio.ByteOrder P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private int T;
    private int U;
    private byte[] V;
    private int W;
    private int X;
    private int Y;
    private int Z;
    private int aa;
    private defpackage.eko ab;
    private boolean ac;

    static {
        java.util.Arrays.asList(1, 6, 3, 8);
        java.util.Arrays.asList(2, 7, 4, 5);
        a = new int[]{8, 8, 8};
        b = new int[]{8};
        c = new byte[]{-1, -40, -1};
        l = new byte[]{102, 116, 121, 112};
        m = new byte[]{109, 105, 102, 49};
        n = new byte[]{104, 101, 105, 99};
        o = new byte[]{97, 118, 105, 102};
        p = new byte[]{97, 118, 105, 115};
        q = new byte[]{79, 76, 89, 77, 80, 0};
        r = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        s = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        d = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(java.nio.charset.StandardCharsets.UTF_8);
        t = new byte[]{82, 73, 70, 70};
        u = new byte[]{87, 69, 66, 80};
        v = new byte[]{69, 88, 73, 70};
        w = new byte[]{-99, 1, 42};
        x = "VP8X".getBytes(java.nio.charset.Charset.defaultCharset());
        y = "VP8L".getBytes(java.nio.charset.Charset.defaultCharset());
        z = "VP8 ".getBytes(java.nio.charset.Charset.defaultCharset());
        A = "ANIM".getBytes(java.nio.charset.Charset.defaultCharset());
        B = "ANMF".getBytes(java.nio.charset.Charset.defaultCharset());
        e = new java.lang.String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        g = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        ahox[] ahoxVarArr = {new ahox("NewSubfileType", 254, 4), new ahox("SubfileType", 255, 4), new ahox("ImageWidth", 256, 3, 4), new ahox("ImageLength", 257, 3, 4), new ahox("BitsPerSample", 258, 3), new ahox("Compression", 259, 3), new ahox("PhotometricInterpretation", 262, 3), new ahox("ImageDescription", 270, 2), new ahox("Make", 271, 2), new ahox("Model", 272, 2), new ahox("StripOffsets", 273, 3, 4), new ahox("Orientation", 274, 3), new ahox("SamplesPerPixel", 277, 3), new ahox("RowsPerStrip", 278, 3, 4), new ahox("StripByteCounts", 279, 3, 4), new ahox("XResolution", 282, 5), new ahox("YResolution", 283, 5), new ahox("PlanarConfiguration", 284, 3), new ahox("ResolutionUnit", 296, 3), new ahox("TransferFunction", 301, 3), new ahox("Software", 305, 2), new ahox("DateTime", 306, 2), new ahox("Artist", 315, 2), new ahox("WhitePoint", 318, 5), new ahox("PrimaryChromaticities", 319, 5), new ahox("SubIFDPointer", 330, 4), new ahox("JPEGInterchangeFormat", 513, 4), new ahox("JPEGInterchangeFormatLength", 514, 4), new ahox("YCbCrCoefficients", 529, 5), new ahox("YCbCrSubSampling", 530, 3), new ahox("YCbCrPositioning", 531, 3), new ahox("ReferenceBlackWhite", 532, 5), new ahox("Copyright", 33432, 2), new ahox("ExifIFDPointer", 34665, 4), new ahox("GPSInfoIFDPointer", 34853, 4), new ahox("SensorTopBorder", 4, 4), new ahox("SensorLeftBorder", 5, 4), new ahox("SensorBottomBorder", 6, 4), new ahox("SensorRightBorder", 7, 4), new ahox("ISO", 23, 3), new ahox("JpgFromRaw", 46, 7), new ahox("Xmp", 700, 1)};
        ad = ahoxVarArr;
        ahox[] ahoxVarArr2 = {new ahox("ExposureTime", 33434, 5), new ahox("FNumber", 33437, 5), new ahox("ExposureProgram", 34850, 3), new ahox("SpectralSensitivity", 34852, 2), new ahox("PhotographicSensitivity", 34855, 3), new ahox("OECF", 34856, 7), new ahox("SensitivityType", 34864, 3), new ahox("StandardOutputSensitivity", 34865, 4), new ahox("RecommendedExposureIndex", 34866, 4), new ahox("ISOSpeed", 34867, 4), new ahox("ISOSpeedLatitudeyyy", 34868, 4), new ahox("ISOSpeedLatitudezzz", 34869, 4), new ahox("ExifVersion", 36864, 2), new ahox("DateTimeOriginal", 36867, 2), new ahox("DateTimeDigitized", 36868, 2), new ahox("OffsetTime", 36880, 2), new ahox("OffsetTimeOriginal", 36881, 2), new ahox("OffsetTimeDigitized", 36882, 2), new ahox("ComponentsConfiguration", 37121, 7), new ahox("CompressedBitsPerPixel", 37122, 5), new ahox("ShutterSpeedValue", 37377, 10), new ahox("ApertureValue", 37378, 5), new ahox("BrightnessValue", 37379, 10), new ahox("ExposureBiasValue", 37380, 10), new ahox("MaxApertureValue", 37381, 5), new ahox("SubjectDistance", 37382, 5), new ahox("MeteringMode", 37383, 3), new ahox("LightSource", 37384, 3), new ahox("Flash", 37385, 3), new ahox("FocalLength", 37386, 5), new ahox("SubjectArea", 37396, 3), new ahox("MakerNote", 37500, 7), new ahox("UserComment", 37510, 7), new ahox("SubSecTime", 37520, 2), new ahox("SubSecTimeOriginal", 37521, 2), new ahox("SubSecTimeDigitized", 37522, 2), new ahox("FlashpixVersion", 40960, 7), new ahox("ColorSpace", 40961, 3), new ahox("PixelXDimension", 40962, 3, 4), new ahox("PixelYDimension", 40963, 3, 4), new ahox("RelatedSoundFile", 40964, 2), new ahox("InteroperabilityIFDPointer", 40965, 4), new ahox("FlashEnergy", 41483, 5), new ahox("SpatialFrequencyResponse", 41484, 7), new ahox("FocalPlaneXResolution", 41486, 5), new ahox("FocalPlaneYResolution", 41487, 5), new ahox("FocalPlaneResolutionUnit", 41488, 3), new ahox("SubjectLocation", 41492, 3), new ahox("ExposureIndex", 41493, 5), new ahox("SensingMethod", 41495, 3), new ahox("FileSource", 41728, 7), new ahox("SceneType", 41729, 7), new ahox("CFAPattern", 41730, 7), new ahox("CustomRendered", 41985, 3), new ahox("ExposureMode", 41986, 3), new ahox("WhiteBalance", 41987, 3), new ahox("DigitalZoomRatio", 41988, 5), new ahox("FocalLengthIn35mmFilm", 41989, 3), new ahox("SceneCaptureType", 41990, 3), new ahox("GainControl", 41991, 3), new ahox("Contrast", 41992, 3), new ahox("Saturation", 41993, 3), new ahox("Sharpness", 41994, 3), new ahox("DeviceSettingDescription", 41995, 7), new ahox("SubjectDistanceRange", 41996, 3), new ahox("ImageUniqueID", 42016, 2), new ahox("CameraOwnerName", 42032, 2), new ahox("BodySerialNumber", 42033, 2), new ahox("LensSpecification", 42034, 5), new ahox("LensMake", 42035, 2), new ahox("LensModel", 42036, 2), new ahox("Gamma", 42240, 5), new ahox("DNGVersion", 50706, 1), new ahox("DefaultCropSize", 50720, 3, 4)};
        ae = ahoxVarArr2;
        ahox[] ahoxVarArr3 = {new ahox("GPSVersionID", 0, 1), new ahox("GPSLatitudeRef", 1, 2), new ahox("GPSLatitude", 2, 5, 10), new ahox("GPSLongitudeRef", 3, 2), new ahox("GPSLongitude", 4, 5, 10), new ahox("GPSAltitudeRef", 5, 1), new ahox("GPSAltitude", 6, 5), new ahox("GPSTimeStamp", 7, 5), new ahox("GPSSatellites", 8, 2), new ahox("GPSStatus", 9, 2), new ahox("GPSMeasureMode", 10, 2), new ahox("GPSDOP", 11, 5), new ahox("GPSSpeedRef", 12, 2), new ahox("GPSSpeed", 13, 5), new ahox("GPSTrackRef", 14, 2), new ahox("GPSTrack", 15, 5), new ahox("GPSImgDirectionRef", 16, 2), new ahox("GPSImgDirection", 17, 5), new ahox("GPSMapDatum", 18, 2), new ahox("GPSDestLatitudeRef", 19, 2), new ahox("GPSDestLatitude", 20, 5), new ahox("GPSDestLongitudeRef", 21, 2), new ahox("GPSDestLongitude", 22, 5), new ahox("GPSDestBearingRef", 23, 2), new ahox("GPSDestBearing", 24, 5), new ahox("GPSDestDistanceRef", 25, 2), new ahox("GPSDestDistance", 26, 5), new ahox("GPSProcessingMethod", 27, 7), new ahox("GPSAreaInformation", 28, 7), new ahox("GPSDateStamp", 29, 2), new ahox("GPSDifferential", 30, 3), new ahox("GPSHPositioningError", 31, 5)};
        af = ahoxVarArr3;
        ahox[] ahoxVarArr4 = {new ahox("InteroperabilityIndex", 1, 2)};
        ag = ahoxVarArr4;
        ahox[] ahoxVarArr5 = {new ahox("NewSubfileType", 254, 4), new ahox("SubfileType", 255, 4), new ahox("ThumbnailImageWidth", 256, 3, 4), new ahox("ThumbnailImageLength", 257, 3, 4), new ahox("BitsPerSample", 258, 3), new ahox("Compression", 259, 3), new ahox("PhotometricInterpretation", 262, 3), new ahox("ImageDescription", 270, 2), new ahox("Make", 271, 2), new ahox("Model", 272, 2), new ahox("StripOffsets", 273, 3, 4), new ahox("ThumbnailOrientation", 274, 3), new ahox("SamplesPerPixel", 277, 3), new ahox("RowsPerStrip", 278, 3, 4), new ahox("StripByteCounts", 279, 3, 4), new ahox("XResolution", 282, 5), new ahox("YResolution", 283, 5), new ahox("PlanarConfiguration", 284, 3), new ahox("ResolutionUnit", 296, 3), new ahox("TransferFunction", 301, 3), new ahox("Software", 305, 2), new ahox("DateTime", 306, 2), new ahox("Artist", 315, 2), new ahox("WhitePoint", 318, 5), new ahox("PrimaryChromaticities", 319, 5), new ahox("SubIFDPointer", 330, 4), new ahox("JPEGInterchangeFormat", 513, 4), new ahox("JPEGInterchangeFormatLength", 514, 4), new ahox("YCbCrCoefficients", 529, 5), new ahox("YCbCrSubSampling", 530, 3), new ahox("YCbCrPositioning", 531, 3), new ahox("ReferenceBlackWhite", 532, 5), new ahox("Copyright", 33432, 2), new ahox("ExifIFDPointer", 34665, 4), new ahox("GPSInfoIFDPointer", 34853, 4), new ahox("DNGVersion", 50706, 1), new ahox("DefaultCropSize", 50720, 3, 4)};
        ah = ahoxVarArr5;
        ai = new ahox("StripOffsets", 273, 3);
        ahox[] ahoxVarArr6 = {new ahox("ThumbnailImage", 256, 7), new ahox("CameraSettingsIFDPointer", 8224, 4), new ahox("ImageProcessingIFDPointer", 8256, 4)};
        aj = ahoxVarArr6;
        ahox[] ahoxVarArr7 = {new ahox("PreviewImageStart", 257, 4), new ahox("PreviewImageLength", 258, 4)};
        ak = ahoxVarArr7;
        ahox[] ahoxVarArr8 = {new ahox("AspectFrame", 4371, 3)};
        al = ahoxVarArr8;
        ahox[] ahoxVarArr9 = {new ahox("ColorSpace", 55, 3)};
        am = ahoxVarArr9;
        j = new ahox[][]{ahoxVarArr, ahoxVarArr2, ahoxVarArr3, ahoxVarArr4, ahoxVarArr5, ahoxVarArr, ahoxVarArr6, ahoxVarArr7, ahoxVarArr8, ahoxVarArr9};
        an = new ahox[]{new ahox("SubIFDPointer", 330, 4), new ahox("ExifIFDPointer", 34665, 4), new ahox("GPSInfoIFDPointer", 34853, 4), new ahox("InteroperabilityIFDPointer", 40965, 4), new ahox("CameraSettingsIFDPointer", 8224, 1), new ahox("ImageProcessingIFDPointer", 8256, 1)};
        E = new java.util.HashMap[10];
        F = new java.util.HashMap[10];
        G = j$.util.DesugarCollections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        H = new java.util.HashMap();
        java.nio.charset.Charset charsetForName = java.nio.charset.Charset.forName("US-ASCII");
        h = charsetForName;
        i = "Exif\u0000\u0000".getBytes(charsetForName);
        I = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy:MM:dd HH:mm:ss", java.util.Locale.US);
        C = simpleDateFormat;
        simpleDateFormat.setTimeZone(j$.util.DesugarTimeZone.getTimeZone("UTC"));
        java.text.SimpleDateFormat simpleDateFormat2 = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.US);
        D = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(j$.util.DesugarTimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            ahox[][] ahoxVarArr10 = j;
            int length = ahoxVarArr10.length;
            if (i2 >= 10) {
                ahox[] ahoxVarArr11 = an;
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(ahoxVarArr11[0].b);
                java.util.HashMap map = H;
                map.put(numValueOf, 5);
                map.put(java.lang.Integer.valueOf(ahoxVarArr11[1].b), 1);
                map.put(java.lang.Integer.valueOf(ahoxVarArr11[2].b), 2);
                map.put(java.lang.Integer.valueOf(ahoxVarArr11[3].b), 3);
                map.put(java.lang.Integer.valueOf(ahoxVarArr11[4].b), 7);
                map.put(java.lang.Integer.valueOf(ahoxVarArr11[5].b), 8);
                java.util.regex.Pattern.compile(".*[1-9].*");
                java.util.regex.Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                java.util.regex.Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                java.util.regex.Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            E[i2] = new java.util.HashMap();
            F[i2] = new java.util.HashMap();
            for (ahox ahoxVar : ahoxVarArr10[i2]) {
                E[i2].put(java.lang.Integer.valueOf(ahoxVar.b), ahoxVar);
                F[i2].put(ahoxVar.d, ahoxVar);
            }
            i2++;
        }
    }

    public ekq(java.io.File file) throws java.lang.Throwable {
        int length = j.length;
        this.N = new java.util.HashMap[10];
        this.O = new java.util.HashSet(10);
        this.P = java.nio.ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new java.lang.NullPointerException("file cannot be null");
        }
        java.lang.String absolutePath = file.getAbsolutePath();
        if (absolutePath == null) {
            throw new java.lang.NullPointerException("filename cannot be null");
        }
        java.io.FileInputStream fileInputStream = null;
        this.L = null;
        this.J = absolutePath;
        try {
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(absolutePath);
            try {
                if (B(fileInputStream2.getFD())) {
                    this.K = fileInputStream2.getFD();
                } else {
                    this.K = null;
                }
                o(fileInputStream2);
                mni.bg(fileInputStream2);
            } catch (java.lang.Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                mni.bg(fileInputStream);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    private final void A(defpackage.ekn eknVar) throws java.io.IOException {
        eknVar.b(this.ab.d.length + 22);
        java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
        eknVar.b(1767135348);
        x(crc32, 1767135348);
        byte[] bArr = d;
        eknVar.write(bArr);
        crc32.update(bArr);
        eknVar.write(this.ab.d);
        crc32.update(this.ab.d);
        eknVar.b((int) crc32.getValue());
        this.ac = true;
    }

    private static boolean B(java.io.FileDescriptor fileDescriptor) {
        try {
            android.system.Os.lseek(fileDescriptor, 0L, android.system.OsConstants.SEEK_CUR);
            return true;
        } catch (java.lang.Exception unused) {
            if (k) {
                android.util.Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            }
            return false;
        }
    }

    private final boolean C(java.util.HashMap map) throws java.lang.Throwable {
        defpackage.eko ekoVar = (defpackage.eko) map.get("ImageLength");
        defpackage.eko ekoVar2 = (defpackage.eko) map.get("ImageWidth");
        if (ekoVar != null && ekoVar2 != null) {
            int iA = ekoVar.a(this.P);
            int iA2 = ekoVar2.a(this.P);
            if (iA <= 512 && iA2 <= 512) {
                return true;
            }
        }
        return false;
    }

    private final void D(defpackage.ekm ekmVar) throws java.lang.Throwable {
        p(ekmVar);
        E(ekmVar, 0);
        F(ekmVar, 0);
        F(ekmVar, 5);
        F(ekmVar, 4);
        y();
        if (this.M == 8) {
            java.util.HashMap[] mapArr = this.N;
            defpackage.eko ekoVar = (defpackage.eko) mapArr[1].get("MakerNote");
            if (ekoVar != null) {
                defpackage.ekm ekmVar2 = new defpackage.ekm(ekoVar.d, (byte[]) null);
                ekmVar2.c = this.P;
                ekmVar2.b(6);
                E(ekmVar2, 9);
                defpackage.eko ekoVar2 = (defpackage.eko) mapArr[9].get("ColorSpace");
                if (ekoVar2 != null) {
                    mapArr[1].put("ColorSpace", ekoVar2);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0205  */
    /* JADX WARN: Code duplicated, block: B:104:0x020a  */
    /* JADX WARN: Code duplicated, block: B:105:0x020f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0216  */
    /* JADX WARN: Code duplicated, block: B:111:0x0234  */
    /* JADX WARN: Code duplicated, block: B:121:0x0274 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0276  */
    /* JADX WARN: Code duplicated, block: B:124:0x0280  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:129:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:132:0x02da  */
    /* JADX WARN: Code duplicated, block: B:134:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:143:0x030c  */
    /* JADX WARN: Code duplicated, block: B:168:0x030f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:65:0x013e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0145  */
    /* JADX WARN: Code duplicated, block: B:68:0x014b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0153  */
    /* JADX WARN: Code duplicated, block: B:73:0x0163  */
    /* JADX WARN: Code duplicated, block: B:75:0x016d  */
    /* JADX WARN: Code duplicated, block: B:76:0x016f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0172  */
    /* JADX WARN: Code duplicated, block: B:79:0x0175  */
    /* JADX WARN: Code duplicated, block: B:81:0x017d  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01be  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f9  */
    /* JADX WARN: Instruction removed from duplicated block: B:124:0x0280, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x00d3, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:89:0x01d0, please report this as an issue */
    private final void E(defpackage.ekm ekmVar, int i2) throws java.io.IOException {
        boolean z2;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        short s2;
        long j2;
        boolean z6;
        int i4;
        long j3;
        int i5;
        java.lang.Integer num;
        java.lang.Object obj;
        int unsignedShort;
        long jA;
        java.lang.String strBz;
        int i6;
        int i7;
        java.lang.Object obj2;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(ekmVar.b);
        java.util.Set set = this.O;
        set.add(numValueOf);
        short s3 = ekmVar.readShort();
        boolean z7 = k;
        if (z7) {
            android.util.Log.d("ExifInterface", a.bj(s3, "numberOfDirectoryEntry: "));
        }
        if (s3 > 0) {
            short s4 = 0;
            while (s4 < s3) {
                int unsignedShort2 = ekmVar.readUnsignedShort();
                int unsignedShort3 = ekmVar.readUnsignedShort();
                int i8 = ekmVar.readInt();
                long j4 = ekmVar.b;
                java.util.HashMap map = E[i2];
                java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(unsignedShort2);
                ahox ahoxVar = (ahox) map.get(numValueOf2);
                if (z7) {
                    i3 = 3;
                    android.util.Log.d("ExifInterface", java.lang.String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", java.lang.Integer.valueOf(i2), numValueOf2, ahoxVar != null ? ahoxVar.d : null, java.lang.Integer.valueOf(unsignedShort3), java.lang.Integer.valueOf(i8)));
                    z3 = true;
                } else {
                    i3 = 3;
                    z3 = false;
                }
                if (ahoxVar == null) {
                    if (z3) {
                        android.util.Log.d("ExifInterface", a.bj(unsignedShort2, "Skip the tag entry since tag number is not defined: "));
                    }
                    z4 = z3;
                    z5 = z7;
                } else {
                    if (unsignedShort3 > 0) {
                        int[] iArr = f;
                        int length = iArr.length;
                        if (unsignedShort3 >= 14) {
                            z4 = z3;
                            z5 = z7;
                            if (z3) {
                                s2 = s4;
                            }
                            j2 = 0;
                            z6 = false;
                            j3 = j4 + 4;
                            if (z6) {
                                if (j2 > 4) {
                                    i7 = ekmVar.readInt();
                                    if (z4) {
                                        android.util.Log.d("ExifInterface", a.bj(i7, "seek to data offset: "));
                                    }
                                    if (this.M == 7) {
                                        obj2 = ahoxVar.d;
                                        if ("MakerNote".equals(obj2)) {
                                            this.Y = i7;
                                        } else if (i2 == 6) {
                                            if ("ThumbnailImage".equals(obj2)) {
                                                this.Z = i7;
                                                this.aa = i8;
                                                defpackage.eko ekoVarH = defpackage.eko.h(6, this.P);
                                                defpackage.eko ekoVarD = defpackage.eko.d(this.Z, this.P);
                                                defpackage.eko ekoVarD2 = defpackage.eko.d(this.aa, this.P);
                                                java.util.HashMap[] mapArr = this.N;
                                                mapArr[4].put("Compression", ekoVarH);
                                                mapArr[4].put("JPEGInterchangeFormat", ekoVarD);
                                                mapArr[4].put("JPEGInterchangeFormatLength", ekoVarD2);
                                            }
                                            i5 = 6;
                                        }
                                        i8 = i8;
                                        i5 = i2;
                                    } else {
                                        i8 = i8;
                                        i5 = i2;
                                    }
                                    ekmVar.c(i7);
                                } else {
                                    i8 = i8;
                                    i5 = i2;
                                }
                                num = (java.lang.Integer) H.get(numValueOf2);
                                if (z4) {
                                    android.util.Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                                }
                                if (num != null) {
                                    if (unsignedShort3 != 3) {
                                        if (unsignedShort3 == 4) {
                                            jA = ekmVar.a();
                                        } else if (unsignedShort3 == 8) {
                                            unsignedShort = ekmVar.readShort();
                                        } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                            unsignedShort = ekmVar.readInt();
                                        } else {
                                            jA = -1;
                                        }
                                        if (z4) {
                                            android.util.Log.d("ExifInterface", java.lang.String.format("Offset: %d, tagName: %s", java.lang.Long.valueOf(jA), ahoxVar.d));
                                        }
                                        if (jA > 0 || ((i6 = ekmVar.d) != -1 && jA >= i6)) {
                                            if (z4) {
                                                strBz = a.bz(jA, "Skip jump into the IFD since its offset is invalid: ");
                                                if (ekmVar.d != -1) {
                                                    strBz = strBz + " (total length: " + ekmVar.d + ')';
                                                }
                                                android.util.Log.d("ExifInterface", strBz);
                                            }
                                        } else if (!set.contains(java.lang.Integer.valueOf((int) jA))) {
                                            ekmVar.c(jA);
                                            E(ekmVar, num.intValue());
                                        } else if (z4) {
                                            android.util.Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jA + ')');
                                        }
                                        ekmVar.c(j3);
                                    } else {
                                        unsignedShort = ekmVar.readUnsignedShort();
                                    }
                                    jA = unsignedShort;
                                    if (z4) {
                                        android.util.Log.d("ExifInterface", java.lang.String.format("Offset: %d, tagName: %s", java.lang.Long.valueOf(jA), ahoxVar.d));
                                    }
                                    if (jA > 0) {
                                        if (z4) {
                                            strBz = a.bz(jA, "Skip jump into the IFD since its offset is invalid: ");
                                            if (ekmVar.d != -1) {
                                                strBz = strBz + " (total length: " + ekmVar.d + ')';
                                            }
                                            android.util.Log.d("ExifInterface", strBz);
                                        }
                                    } else if (z4) {
                                        strBz = a.bz(jA, "Skip jump into the IFD since its offset is invalid: ");
                                        if (ekmVar.d != -1) {
                                            strBz = strBz + " (total length: " + ekmVar.d + ')';
                                        }
                                        android.util.Log.d("ExifInterface", strBz);
                                    }
                                    ekmVar.c(j3);
                                } else {
                                    int i9 = ekmVar.b + this.X;
                                    byte[] bArr = new byte[(int) j2];
                                    ekmVar.readFully(bArr);
                                    defpackage.eko ekoVar = new defpackage.eko(unsignedShort3, i8, i9, bArr);
                                    java.util.HashMap map2 = this.N[i5];
                                    obj = ahoxVar.d;
                                    map2.put(obj, ekoVar);
                                    if ("DNGVersion".equals(obj)) {
                                        this.M = 3;
                                    }
                                    if (((!"Make".equals(obj) || "Model".equals(obj)) && ekoVar.k(this.P).contains("PENTAX")) || ("Compression".equals(obj) && ekoVar.a(this.P) == 65535)) {
                                        this.M = 8;
                                    }
                                    if (ekmVar.b != j3) {
                                        ekmVar.c(j3);
                                    }
                                }
                            } else {
                                ekmVar.c(j3);
                                s2 = s2;
                            }
                            s4 = (short) (s2 + 1);
                            s3 = s3;
                            z7 = z5;
                        } else {
                            int i10 = ahoxVar.c;
                            z4 = z3;
                            int i11 = 7;
                            if (i10 == 7 || unsignedShort3 == 7) {
                                z5 = z7;
                            } else {
                                if (i10 == unsignedShort3 || (i4 = ahoxVar.a) == unsignedShort3) {
                                    z5 = z7;
                                } else {
                                    z5 = z7;
                                    if (i10 != 4) {
                                        if (i4 == 4) {
                                            i4 = 4;
                                            if (unsignedShort3 != i3) {
                                            }
                                        }
                                        if (i10 == 9) {
                                        }
                                        if (z4) {
                                            android.util.Log.d("ExifInterface", "Skip the tag entry since data format (" + e[unsignedShort3] + ") is unexpected for tag: " + ((java.lang.String) ahoxVar.d));
                                        }
                                    } else if (unsignedShort3 != i3) {
                                        if ((i10 == 9 && i4 != 9) || unsignedShort3 != 8) {
                                            if (z4) {
                                                android.util.Log.d("ExifInterface", "Skip the tag entry since data format (" + e[unsignedShort3] + ") is unexpected for tag: " + ((java.lang.String) ahoxVar.d));
                                            }
                                        }
                                    }
                                }
                                i11 = 7;
                            }
                            if (unsignedShort3 == i11) {
                                unsignedShort3 = i10;
                            }
                            s2 = s4;
                            j2 = ((long) iArr[unsignedShort3]) * ((long) i8);
                            if (j2 < 0 || j2 > 2147483647L) {
                                if (z4) {
                                    android.util.Log.d("ExifInterface", a.bj(i8, "Skip the tag entry since the number of components is invalid: "));
                                }
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            j3 = j4 + 4;
                            if (z6) {
                                ekmVar.c(j3);
                                s2 = s2;
                            } else {
                                if (j2 > 4) {
                                    i7 = ekmVar.readInt();
                                    if (z4) {
                                        android.util.Log.d("ExifInterface", a.bj(i7, "seek to data offset: "));
                                    }
                                    if (this.M == 7) {
                                        obj2 = ahoxVar.d;
                                        if ("MakerNote".equals(obj2)) {
                                            this.Y = i7;
                                        } else if (i2 == 6) {
                                            if ("ThumbnailImage".equals(obj2)) {
                                                this.Z = i7;
                                                this.aa = i8;
                                                defpackage.eko ekoVarH2 = defpackage.eko.h(6, this.P);
                                                defpackage.eko ekoVarD3 = defpackage.eko.d(this.Z, this.P);
                                                defpackage.eko ekoVarD4 = defpackage.eko.d(this.aa, this.P);
                                                java.util.HashMap[] mapArr2 = this.N;
                                                mapArr2[4].put("Compression", ekoVarH2);
                                                mapArr2[4].put("JPEGInterchangeFormat", ekoVarD3);
                                                mapArr2[4].put("JPEGInterchangeFormatLength", ekoVarD4);
                                            }
                                            i5 = 6;
                                        }
                                        i8 = i8;
                                        i5 = i2;
                                    } else {
                                        i8 = i8;
                                        i5 = i2;
                                    }
                                    ekmVar.c(i7);
                                } else {
                                    i8 = i8;
                                    i5 = i2;
                                }
                                num = (java.lang.Integer) H.get(numValueOf2);
                                if (z4) {
                                    android.util.Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                                }
                                if (num != null) {
                                    if (unsignedShort3 != 3) {
                                        if (unsignedShort3 == 4) {
                                            jA = ekmVar.a();
                                        } else if (unsignedShort3 == 8) {
                                            if (unsignedShort3 != 9) {
                                            }
                                            unsignedShort = ekmVar.readInt();
                                        } else {
                                            unsignedShort = ekmVar.readShort();
                                        }
                                        if (z4) {
                                            android.util.Log.d("ExifInterface", java.lang.String.format("Offset: %d, tagName: %s", java.lang.Long.valueOf(jA), ahoxVar.d));
                                        }
                                        if (jA > 0) {
                                            if (z4) {
                                                strBz = a.bz(jA, "Skip jump into the IFD since its offset is invalid: ");
                                                if (ekmVar.d != -1) {
                                                    strBz = strBz + " (total length: " + ekmVar.d + ')';
                                                }
                                                android.util.Log.d("ExifInterface", strBz);
                                            }
                                        } else if (z4) {
                                            strBz = a.bz(jA, "Skip jump into the IFD since its offset is invalid: ");
                                            if (ekmVar.d != -1) {
                                                strBz = strBz + " (total length: " + ekmVar.d + ')';
                                            }
                                            android.util.Log.d("ExifInterface", strBz);
                                        }
                                        ekmVar.c(j3);
                                    } else {
                                        unsignedShort = ekmVar.readUnsignedShort();
                                    }
                                    jA = unsignedShort;
                                    if (z4) {
                                        android.util.Log.d("ExifInterface", java.lang.String.format("Offset: %d, tagName: %s", java.lang.Long.valueOf(jA), ahoxVar.d));
                                    }
                                    if (jA > 0) {
                                        if (z4) {
                                            strBz = a.bz(jA, "Skip jump into the IFD since its offset is invalid: ");
                                            if (ekmVar.d != -1) {
                                                strBz = strBz + " (total length: " + ekmVar.d + ')';
                                            }
                                            android.util.Log.d("ExifInterface", strBz);
                                        }
                                    } else if (z4) {
                                        strBz = a.bz(jA, "Skip jump into the IFD since its offset is invalid: ");
                                        if (ekmVar.d != -1) {
                                            strBz = strBz + " (total length: " + ekmVar.d + ')';
                                        }
                                        android.util.Log.d("ExifInterface", strBz);
                                    }
                                    ekmVar.c(j3);
                                } else {
                                    int i12 = ekmVar.b + this.X;
                                    byte[] bArr2 = new byte[(int) j2];
                                    ekmVar.readFully(bArr2);
                                    defpackage.eko ekoVar2 = new defpackage.eko(unsignedShort3, i8, i12, bArr2);
                                    java.util.HashMap map3 = this.N[i5];
                                    obj = ahoxVar.d;
                                    map3.put(obj, ekoVar2);
                                    if ("DNGVersion".equals(obj)) {
                                        this.M = 3;
                                    }
                                    if (!"Make".equals(obj)) {
                                    }
                                    this.M = 8;
                                    if (ekmVar.b != j3) {
                                        ekmVar.c(j3);
                                    }
                                }
                            }
                            s4 = (short) (s2 + 1);
                            s3 = s3;
                            z7 = z5;
                        }
                    } else {
                        z4 = z3;
                        z5 = z7;
                        s2 = s4;
                        if (z4) {
                        }
                        j2 = 0;
                        z6 = false;
                        j3 = j4 + 4;
                        if (z6) {
                            ekmVar.c(j3);
                            s2 = s2;
                        } else {
                            if (j2 > 4) {
                                i7 = ekmVar.readInt();
                                if (z4) {
                                    android.util.Log.d("ExifInterface", a.bj(i7, "seek to data offset: "));
                                }
                                if (this.M == 7) {
                                    obj2 = ahoxVar.d;
                                    if ("MakerNote".equals(obj2)) {
                                        this.Y = i7;
                                    } else if (i2 == 6) {
                                        if ("ThumbnailImage".equals(obj2)) {
                                            this.Z = i7;
                                            this.aa = i8;
                                            defpackage.eko ekoVarH3 = defpackage.eko.h(6, this.P);
                                            defpackage.eko ekoVarD5 = defpackage.eko.d(this.Z, this.P);
                                            defpackage.eko ekoVarD6 = defpackage.eko.d(this.aa, this.P);
                                            java.util.HashMap[] mapArr3 = this.N;
                                            mapArr3[4].put("Compression", ekoVarH3);
                                            mapArr3[4].put("JPEGInterchangeFormat", ekoVarD5);
                                            mapArr3[4].put("JPEGInterchangeFormatLength", ekoVarD6);
                                        }
                                        i5 = 6;
                                    }
                                    i8 = i8;
                                    i5 = i2;
                                } else {
                                    i8 = i8;
                                    i5 = i2;
                                }
                                ekmVar.c(i7);
                            } else {
                                i8 = i8;
                                i5 = i2;
                            }
                            num = (java.lang.Integer) H.get(numValueOf2);
                            if (z4) {
                                android.util.Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                            }
                            if (num != null) {
                                if (unsignedShort3 != 3) {
                                    if (unsignedShort3 == 4) {
                                        jA = ekmVar.a();
                                    } else if (unsignedShort3 == 8) {
                                        if (unsignedShort3 != 9) {
                                        }
                                        unsignedShort = ekmVar.readInt();
                                    } else {
                                        unsignedShort = ekmVar.readShort();
                                    }
                                    if (z4) {
                                        android.util.Log.d("ExifInterface", java.lang.String.format("Offset: %d, tagName: %s", java.lang.Long.valueOf(jA), ahoxVar.d));
                                    }
                                    if (jA > 0) {
                                        if (z4) {
                                            strBz = a.bz(jA, "Skip jump into the IFD since its offset is invalid: ");
                                            if (ekmVar.d != -1) {
                                                strBz = strBz + " (total length: " + ekmVar.d + ')';
                                            }
                                            android.util.Log.d("ExifInterface", strBz);
                                        }
                                    } else if (z4) {
                                        strBz = a.bz(jA, "Skip jump into the IFD since its offset is invalid: ");
                                        if (ekmVar.d != -1) {
                                            strBz = strBz + " (total length: " + ekmVar.d + ')';
                                        }
                                        android.util.Log.d("ExifInterface", strBz);
                                    }
                                    ekmVar.c(j3);
                                } else {
                                    unsignedShort = ekmVar.readUnsignedShort();
                                }
                                jA = unsignedShort;
                                if (z4) {
                                    android.util.Log.d("ExifInterface", java.lang.String.format("Offset: %d, tagName: %s", java.lang.Long.valueOf(jA), ahoxVar.d));
                                }
                                if (jA > 0) {
                                    if (z4) {
                                        strBz = a.bz(jA, "Skip jump into the IFD since its offset is invalid: ");
                                        if (ekmVar.d != -1) {
                                            strBz = strBz + " (total length: " + ekmVar.d + ')';
                                        }
                                        android.util.Log.d("ExifInterface", strBz);
                                    }
                                } else if (z4) {
                                    strBz = a.bz(jA, "Skip jump into the IFD since its offset is invalid: ");
                                    if (ekmVar.d != -1) {
                                        strBz = strBz + " (total length: " + ekmVar.d + ')';
                                    }
                                    android.util.Log.d("ExifInterface", strBz);
                                }
                                ekmVar.c(j3);
                            } else {
                                int i13 = ekmVar.b + this.X;
                                byte[] bArr3 = new byte[(int) j2];
                                ekmVar.readFully(bArr3);
                                defpackage.eko ekoVar3 = new defpackage.eko(unsignedShort3, i8, i13, bArr3);
                                java.util.HashMap map4 = this.N[i5];
                                obj = ahoxVar.d;
                                map4.put(obj, ekoVar3);
                                if ("DNGVersion".equals(obj)) {
                                    this.M = 3;
                                }
                                if (!"Make".equals(obj)) {
                                }
                                this.M = 8;
                                if (ekmVar.b != j3) {
                                    ekmVar.c(j3);
                                }
                            }
                        }
                        s4 = (short) (s2 + 1);
                        s3 = s3;
                        z7 = z5;
                    }
                    android.util.Log.d("ExifInterface", a.bj(unsignedShort3, "Skip the tag entry since data format is invalid: "));
                    j2 = 0;
                    z6 = false;
                    j3 = j4 + 4;
                    if (z6) {
                        ekmVar.c(j3);
                        s2 = s2;
                    } else {
                        if (j2 > 4) {
                            i7 = ekmVar.readInt();
                            if (z4) {
                                android.util.Log.d("ExifInterface", a.bj(i7, "seek to data offset: "));
                            }
                            if (this.M == 7) {
                                obj2 = ahoxVar.d;
                                if ("MakerNote".equals(obj2)) {
                                    this.Y = i7;
                                } else if (i2 == 6) {
                                    if ("ThumbnailImage".equals(obj2)) {
                                        this.Z = i7;
                                        this.aa = i8;
                                        defpackage.eko ekoVarH4 = defpackage.eko.h(6, this.P);
                                        defpackage.eko ekoVarD7 = defpackage.eko.d(this.Z, this.P);
                                        defpackage.eko ekoVarD8 = defpackage.eko.d(this.aa, this.P);
                                        java.util.HashMap[] mapArr4 = this.N;
                                        mapArr4[4].put("Compression", ekoVarH4);
                                        mapArr4[4].put("JPEGInterchangeFormat", ekoVarD7);
                                        mapArr4[4].put("JPEGInterchangeFormatLength", ekoVarD8);
                                    }
                                    i5 = 6;
                                }
                                i8 = i8;
                                i5 = i2;
                            } else {
                                i8 = i8;
                                i5 = i2;
                            }
                            ekmVar.c(i7);
                        } else {
                            i8 = i8;
                            i5 = i2;
                        }
                        num = (java.lang.Integer) H.get(numValueOf2);
                        if (z4) {
                            android.util.Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == 4) {
                                    jA = ekmVar.a();
                                } else if (unsignedShort3 == 8) {
                                    if (unsignedShort3 != 9) {
                                    }
                                    unsignedShort = ekmVar.readInt();
                                } else {
                                    unsignedShort = ekmVar.readShort();
                                }
                                if (z4) {
                                    android.util.Log.d("ExifInterface", java.lang.String.format("Offset: %d, tagName: %s", java.lang.Long.valueOf(jA), ahoxVar.d));
                                }
                                if (jA > 0) {
                                    if (z4) {
                                        strBz = a.bz(jA, "Skip jump into the IFD since its offset is invalid: ");
                                        if (ekmVar.d != -1) {
                                            strBz = strBz + " (total length: " + ekmVar.d + ')';
                                        }
                                        android.util.Log.d("ExifInterface", strBz);
                                    }
                                } else if (z4) {
                                    strBz = a.bz(jA, "Skip jump into the IFD since its offset is invalid: ");
                                    if (ekmVar.d != -1) {
                                        strBz = strBz + " (total length: " + ekmVar.d + ')';
                                    }
                                    android.util.Log.d("ExifInterface", strBz);
                                }
                                ekmVar.c(j3);
                            } else {
                                unsignedShort = ekmVar.readUnsignedShort();
                            }
                            jA = unsignedShort;
                            if (z4) {
                                android.util.Log.d("ExifInterface", java.lang.String.format("Offset: %d, tagName: %s", java.lang.Long.valueOf(jA), ahoxVar.d));
                            }
                            if (jA > 0) {
                                if (z4) {
                                    strBz = a.bz(jA, "Skip jump into the IFD since its offset is invalid: ");
                                    if (ekmVar.d != -1) {
                                        strBz = strBz + " (total length: " + ekmVar.d + ')';
                                    }
                                    android.util.Log.d("ExifInterface", strBz);
                                }
                            } else if (z4) {
                                strBz = a.bz(jA, "Skip jump into the IFD since its offset is invalid: ");
                                if (ekmVar.d != -1) {
                                    strBz = strBz + " (total length: " + ekmVar.d + ')';
                                }
                                android.util.Log.d("ExifInterface", strBz);
                            }
                            ekmVar.c(j3);
                        } else {
                            int i14 = ekmVar.b + this.X;
                            byte[] bArr4 = new byte[(int) j2];
                            ekmVar.readFully(bArr4);
                            defpackage.eko ekoVar4 = new defpackage.eko(unsignedShort3, i8, i14, bArr4);
                            java.util.HashMap map5 = this.N[i5];
                            obj = ahoxVar.d;
                            map5.put(obj, ekoVar4);
                            if ("DNGVersion".equals(obj)) {
                                this.M = 3;
                            }
                            if (!"Make".equals(obj)) {
                            }
                            this.M = 8;
                            if (ekmVar.b != j3) {
                                ekmVar.c(j3);
                            }
                        }
                    }
                    s4 = (short) (s2 + 1);
                    s3 = s3;
                    z7 = z5;
                }
                s2 = s4;
                j2 = 0;
                z6 = false;
                j3 = j4 + 4;
                if (z6) {
                    ekmVar.c(j3);
                    s2 = s2;
                } else {
                    if (j2 > 4) {
                        i7 = ekmVar.readInt();
                        if (z4) {
                            android.util.Log.d("ExifInterface", a.bj(i7, "seek to data offset: "));
                        }
                        if (this.M == 7) {
                            obj2 = ahoxVar.d;
                            if ("MakerNote".equals(obj2)) {
                                this.Y = i7;
                            } else if (i2 == 6) {
                                if ("ThumbnailImage".equals(obj2)) {
                                    this.Z = i7;
                                    this.aa = i8;
                                    defpackage.eko ekoVarH5 = defpackage.eko.h(6, this.P);
                                    defpackage.eko ekoVarD9 = defpackage.eko.d(this.Z, this.P);
                                    defpackage.eko ekoVarD10 = defpackage.eko.d(this.aa, this.P);
                                    java.util.HashMap[] mapArr5 = this.N;
                                    mapArr5[4].put("Compression", ekoVarH5);
                                    mapArr5[4].put("JPEGInterchangeFormat", ekoVarD9);
                                    mapArr5[4].put("JPEGInterchangeFormatLength", ekoVarD10);
                                }
                                i5 = 6;
                            }
                            i8 = i8;
                            i5 = i2;
                        } else {
                            i8 = i8;
                            i5 = i2;
                        }
                        ekmVar.c(i7);
                    } else {
                        i8 = i8;
                        i5 = i2;
                    }
                    num = (java.lang.Integer) H.get(numValueOf2);
                    if (z4) {
                        android.util.Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == 4) {
                                jA = ekmVar.a();
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = ekmVar.readInt();
                            } else {
                                unsignedShort = ekmVar.readShort();
                            }
                            if (z4) {
                                android.util.Log.d("ExifInterface", java.lang.String.format("Offset: %d, tagName: %s", java.lang.Long.valueOf(jA), ahoxVar.d));
                            }
                            if (jA > 0) {
                                if (z4) {
                                    strBz = a.bz(jA, "Skip jump into the IFD since its offset is invalid: ");
                                    if (ekmVar.d != -1) {
                                        strBz = strBz + " (total length: " + ekmVar.d + ')';
                                    }
                                    android.util.Log.d("ExifInterface", strBz);
                                }
                            } else if (z4) {
                                strBz = a.bz(jA, "Skip jump into the IFD since its offset is invalid: ");
                                if (ekmVar.d != -1) {
                                    strBz = strBz + " (total length: " + ekmVar.d + ')';
                                }
                                android.util.Log.d("ExifInterface", strBz);
                            }
                            ekmVar.c(j3);
                        } else {
                            unsignedShort = ekmVar.readUnsignedShort();
                        }
                        jA = unsignedShort;
                        if (z4) {
                            android.util.Log.d("ExifInterface", java.lang.String.format("Offset: %d, tagName: %s", java.lang.Long.valueOf(jA), ahoxVar.d));
                        }
                        if (jA > 0) {
                            if (z4) {
                                strBz = a.bz(jA, "Skip jump into the IFD since its offset is invalid: ");
                                if (ekmVar.d != -1) {
                                    strBz = strBz + " (total length: " + ekmVar.d + ')';
                                }
                                android.util.Log.d("ExifInterface", strBz);
                            }
                        } else if (z4) {
                            strBz = a.bz(jA, "Skip jump into the IFD since its offset is invalid: ");
                            if (ekmVar.d != -1) {
                                strBz = strBz + " (total length: " + ekmVar.d + ')';
                            }
                            android.util.Log.d("ExifInterface", strBz);
                        }
                        ekmVar.c(j3);
                    } else {
                        int i15 = ekmVar.b + this.X;
                        byte[] bArr5 = new byte[(int) j2];
                        ekmVar.readFully(bArr5);
                        defpackage.eko ekoVar5 = new defpackage.eko(unsignedShort3, i8, i15, bArr5);
                        java.util.HashMap map6 = this.N[i5];
                        obj = ahoxVar.d;
                        map6.put(obj, ekoVar5);
                        if ("DNGVersion".equals(obj)) {
                            this.M = 3;
                        }
                        if (!"Make".equals(obj)) {
                        }
                        this.M = 8;
                        if (ekmVar.b != j3) {
                            ekmVar.c(j3);
                        }
                    }
                }
                s4 = (short) (s2 + 1);
                s3 = s3;
                z7 = z5;
            }
            boolean z8 = z7;
            int i16 = ekmVar.readInt();
            if (z8) {
                android.util.Log.d("ExifInterface", java.lang.String.format("nextIfdOffset: %d", java.lang.Integer.valueOf(i16)));
                z2 = true;
            } else {
                z2 = false;
            }
            long j5 = i16;
            if (j5 <= 0) {
                if (z2) {
                    android.util.Log.d("ExifInterface", a.bj(i16, "Stop reading file since a wrong offset may cause an infinite loop: "));
                }
            } else {
                if (set.contains(java.lang.Integer.valueOf(i16))) {
                    if (z2) {
                        android.util.Log.d("ExifInterface", a.bj(i16, "Stop reading file since re-reading an IFD may cause an infinite loop: "));
                        return;
                    }
                    return;
                }
                ekmVar.c(j5);
                java.util.HashMap[] mapArr6 = this.N;
                if (mapArr6[4].isEmpty()) {
                    E(ekmVar, 4);
                } else if (mapArr6[5].isEmpty()) {
                    E(ekmVar, 5);
                }
            }
        }
    }

    private final void F(defpackage.ekm ekmVar, int i2) throws java.lang.Throwable {
        defpackage.eko ekoVarH;
        defpackage.eko ekoVarH2;
        java.util.HashMap[] mapArr = this.N;
        defpackage.eko ekoVar = (defpackage.eko) mapArr[i2].get("DefaultCropSize");
        defpackage.eko ekoVar2 = (defpackage.eko) mapArr[i2].get("SensorTopBorder");
        defpackage.eko ekoVar3 = (defpackage.eko) mapArr[i2].get("SensorLeftBorder");
        defpackage.eko ekoVar4 = (defpackage.eko) mapArr[i2].get("SensorBottomBorder");
        defpackage.eko ekoVar5 = (defpackage.eko) mapArr[i2].get("SensorRightBorder");
        if (ekoVar != null) {
            int i3 = ekoVar.a;
            java.nio.ByteOrder byteOrder = this.P;
            if (i3 == 5) {
                defpackage.ekp[] ekpVarArr = (defpackage.ekp[]) ekoVar.j(byteOrder);
                if (ekpVarArr == null || ekpVarArr.length != 2) {
                    android.util.Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(java.lang.String.valueOf(java.util.Arrays.toString(ekpVarArr))));
                    return;
                } else {
                    ekoVarH = defpackage.eko.f(ekpVarArr[0], this.P);
                    ekoVarH2 = defpackage.eko.f(ekpVarArr[1], this.P);
                }
            } else {
                int[] iArr = (int[]) ekoVar.j(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    android.util.Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(java.lang.String.valueOf(java.util.Arrays.toString(iArr))));
                    return;
                } else {
                    ekoVarH = defpackage.eko.h(iArr[0], this.P);
                    ekoVarH2 = defpackage.eko.h(iArr[1], this.P);
                }
            }
            mapArr[i2].put("ImageWidth", ekoVarH);
            mapArr[i2].put("ImageLength", ekoVarH2);
            return;
        }
        if (ekoVar2 != null && ekoVar3 != null && ekoVar4 != null && ekoVar5 != null) {
            int iA = ekoVar2.a(this.P);
            int iA2 = ekoVar4.a(this.P);
            int iA3 = ekoVar5.a(this.P);
            int iA4 = ekoVar3.a(this.P);
            if (iA2 <= iA || iA3 <= iA4) {
                return;
            }
            defpackage.eko ekoVarH3 = defpackage.eko.h(iA2 - iA, this.P);
            defpackage.eko ekoVarH4 = defpackage.eko.h(iA3 - iA4, this.P);
            mapArr[i2].put("ImageLength", ekoVarH3);
            mapArr[i2].put("ImageWidth", ekoVarH4);
            return;
        }
        defpackage.eko ekoVar6 = (defpackage.eko) mapArr[i2].get("ImageLength");
        defpackage.eko ekoVar7 = (defpackage.eko) mapArr[i2].get("ImageWidth");
        if (ekoVar6 == null || ekoVar7 == null) {
            defpackage.eko ekoVar8 = (defpackage.eko) mapArr[i2].get("JPEGInterchangeFormat");
            defpackage.eko ekoVar9 = (defpackage.eko) mapArr[i2].get("JPEGInterchangeFormatLength");
            if (ekoVar8 == null || ekoVar9 == null) {
                return;
            }
            int iA5 = ekoVar8.a(this.P);
            int iA6 = ekoVar9.a(this.P);
            ekmVar.c(iA5);
            byte[] bArr = new byte[iA6];
            ekmVar.readFully(bArr);
            j(new defpackage.ekm(bArr), iA5, i2);
        }
    }

    private static final void G(defpackage.ekm ekmVar, defpackage.ekn eknVar, byte[] bArr) throws java.io.IOException {
        int i2 = ekmVar.readInt();
        eknVar.write(bArr);
        eknVar.b(i2);
        if (i2 % 2 == 1) {
            i2++;
        }
        defpackage.zb.m(ekmVar, eknVar, i2);
    }

    private static final int H(byte[] bArr) throws java.lang.Throwable {
        long j2;
        defpackage.ekm ekmVar = null;
        try {
            try {
                defpackage.ekm ekmVar2 = new defpackage.ekm(bArr);
                try {
                    long j3 = ekmVar2.readInt();
                    byte[] bArr2 = new byte[4];
                    ekmVar2.readFully(bArr2);
                    if (java.util.Arrays.equals(bArr2, l)) {
                        if (j3 == 1) {
                            j3 = ekmVar2.readLong();
                            j2 = 16;
                            if (j3 >= 16) {
                            }
                        } else {
                            j2 = 8;
                        }
                        if (j3 > 5000) {
                            j3 = 5000;
                        }
                        long j4 = j3 - j2;
                        if (j4 >= 8) {
                            byte[] bArr3 = new byte[4];
                            boolean z2 = false;
                            boolean z3 = false;
                            boolean z4 = false;
                            for (long j5 = 0; j5 < (j4 >> 2); j5++) {
                                try {
                                    ekmVar2.readFully(bArr3);
                                    if (j5 != 1) {
                                        if (java.util.Arrays.equals(bArr3, m)) {
                                            z2 = true;
                                        } else if (java.util.Arrays.equals(bArr3, n)) {
                                            z3 = true;
                                        } else if (java.util.Arrays.equals(bArr3, o) || java.util.Arrays.equals(bArr3, p)) {
                                            z4 = true;
                                        }
                                        if (!z2) {
                                            continue;
                                        } else {
                                            if (z3) {
                                                ekmVar2.close();
                                                return 12;
                                            }
                                            if (z4) {
                                                ekmVar2.close();
                                                return 15;
                                            }
                                        }
                                    }
                                } catch (java.io.EOFException unused) {
                                }
                            }
                        }
                    }
                    ekmVar2.close();
                    return 0;
                } catch (java.lang.Exception e2) {
                    e = e2;
                    ekmVar = ekmVar2;
                    if (k) {
                        android.util.Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (ekmVar == null) {
                        return 0;
                    }
                    ekmVar.close();
                    return 0;
                } catch (java.lang.Throwable th) {
                    th = th;
                    ekmVar = ekmVar2;
                    if (ekmVar != null) {
                        ekmVar.close();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Exception e3) {
            e = e3;
        }
    }

    private static final java.nio.ByteOrder I(defpackage.ekm ekmVar) throws java.io.IOException {
        short s2 = ekmVar.readShort();
        if (s2 == 18761) {
            if (k) {
                android.util.Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return java.nio.ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 != 19789) {
            throw new java.io.IOException("Invalid byte order: ".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(s2))));
        }
        if (k) {
            android.util.Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return java.nio.ByteOrder.BIG_ENDIAN;
    }

    private static final void J(defpackage.ekm ekmVar, defpackage.ekn eknVar, byte[] bArr, byte[] bArr2) throws java.io.IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            ekmVar.readFully(bArr3);
            G(ekmVar, eknVar, bArr3);
            if (java.util.Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && java.util.Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private final int f(defpackage.ekn eknVar) throws java.io.IOException {
        java.util.HashMap[] mapArr;
        ahox[][] ahoxVarArr = j;
        int length = ahoxVarArr.length;
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        ahox[] ahoxVarArr2 = an;
        int length2 = ahoxVarArr2.length;
        for (int i2 = 0; i2 < 6; i2++) {
            s((java.lang.String) ahoxVarArr2[i2].d);
        }
        if (this.Q) {
            if (this.R) {
                s("StripOffsets");
                s("StripByteCounts");
            } else {
                s("JPEGInterchangeFormat");
                s("JPEGInterchangeFormatLength");
            }
        }
        int i3 = 0;
        while (true) {
            int length3 = ahoxVarArr.length;
            mapArr = this.N;
            if (i3 >= 10) {
                break;
            }
            java.util.Iterator it = mapArr[i3].entrySet().iterator();
            while (it.hasNext()) {
                if (((java.util.Map.Entry) it.next()).getValue() == null) {
                    it.remove();
                }
            }
            i3++;
        }
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(ahoxVarArr2[1].d, defpackage.eko.d(0L, this.P));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[r7].put(ahoxVarArr2[2].d, defpackage.eko.d(0L, this.P));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[1].put(ahoxVarArr2[3].d, defpackage.eko.d(0L, this.P));
        }
        int i4 = 4;
        if (this.Q) {
            if (this.R) {
                mapArr[4].put("StripOffsets", defpackage.eko.h(0, this.P));
                mapArr[4].put("StripByteCounts", defpackage.eko.h(this.U, this.P));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", defpackage.eko.d(0L, this.P));
                mapArr[4].put("JPEGInterchangeFormatLength", defpackage.eko.d(this.U, this.P));
            }
        }
        int i5 = 0;
        while (true) {
            int length4 = ahoxVarArr.length;
            if (i5 >= 10) {
                break;
            }
            java.util.Iterator it2 = mapArr[i5].entrySet().iterator();
            int i6 = 0;
            while (it2.hasNext()) {
                int iB = ((defpackage.eko) ((java.util.Map.Entry) it2.next()).getValue()).b();
                if (iB > 4) {
                    i6 += iB;
                }
            }
            iArr2[i5] = iArr2[i5] + i6;
            i5++;
        }
        int size = 8;
        int i7 = 0;
        while (true) {
            int length5 = ahoxVarArr.length;
            if (i7 >= 10) {
                break;
            }
            if (!mapArr[i7].isEmpty()) {
                iArr[i7] = size;
                size += (mapArr[i7].size() * 12) + 6 + iArr2[i7];
            }
            i7++;
        }
        if (this.Q) {
            if (this.R) {
                mapArr[4].put("StripOffsets", defpackage.eko.h(size, this.P));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", defpackage.eko.d(size, this.P));
            }
            this.T = size;
            size += this.U;
        }
        if (this.M == 4) {
            size += 8;
        }
        if (k) {
            int i8 = 0;
            while (true) {
                int length6 = ahoxVarArr.length;
                if (i8 >= 10) {
                    break;
                }
                android.util.Log.d("ExifInterface", java.lang.String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", java.lang.Integer.valueOf(i8), java.lang.Integer.valueOf(iArr[i8]), java.lang.Integer.valueOf(mapArr[i8].size()), java.lang.Integer.valueOf(iArr2[i8]), java.lang.Integer.valueOf(size)));
                i8++;
            }
        }
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(ahoxVarArr2[1].d, defpackage.eko.d(iArr[1], this.P));
        }
        if (!mapArr[r3].isEmpty()) {
            mapArr[0].put(ahoxVarArr2[r3].d, defpackage.eko.d(iArr[r3], this.P));
        }
        if (!mapArr[r3].isEmpty()) {
            mapArr[1].put(ahoxVarArr2[r3].d, defpackage.eko.d(iArr[r3], this.P));
        }
        int i9 = this.M;
        if (i9 == 4) {
            if (size > 65535) {
                throw new java.lang.IllegalStateException(a.bs(size, "Size of exif data (", " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"));
            }
            eknVar.e(size);
            eknVar.write(i);
        } else if (i9 == 13) {
            eknVar.b(size);
            eknVar.b(1700284774);
        } else if (i9 == 14) {
            eknVar.write(v);
            eknVar.b(size);
        }
        int size2 = eknVar.a.size();
        eknVar.c(this.P == java.nio.ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        eknVar.b = this.P;
        eknVar.e(42);
        eknVar.d(8L);
        int i10 = 0;
        while (true) {
            int length7 = ahoxVarArr.length;
            if (i10 >= 10) {
                break;
            }
            if (!mapArr[i10].isEmpty()) {
                eknVar.e(mapArr[i10].size());
                int size3 = iArr[i10] + 2 + (mapArr[i10].size() * 12) + i4;
                for (java.util.Map.Entry entry : mapArr[i10].entrySet()) {
                    int i11 = ((ahox) F[i10].get(entry.getKey())).b;
                    defpackage.eko ekoVar = (defpackage.eko) entry.getValue();
                    int iB2 = ekoVar.b();
                    eknVar.e(i11);
                    eknVar.e(ekoVar.a);
                    eknVar.b(ekoVar.b);
                    if (iB2 > i4) {
                        eknVar.d(size3);
                        size3 += iB2;
                    } else {
                        eknVar.write(ekoVar.d);
                        if (iB2 < i4) {
                            while (iB2 < i4) {
                                eknVar.a(0);
                                iB2++;
                            }
                        }
                    }
                }
                if (i10 != 0) {
                    eknVar.d(0L);
                } else if (mapArr[i4].isEmpty()) {
                    i10 = 0;
                    eknVar.d(0L);
                } else {
                    eknVar.d(iArr[i4]);
                    i10 = 0;
                }
                java.util.Iterator it3 = mapArr[i10].entrySet().iterator();
                while (it3.hasNext()) {
                    byte[] bArr = ((defpackage.eko) ((java.util.Map.Entry) it3.next()).getValue()).d;
                    int length8 = bArr.length;
                    if (length8 > i4) {
                        eknVar.write(bArr, 0, length8);
                        i4 = 4;
                    }
                }
            }
            i10++;
            i4 = 4;
        }
        if (this.Q) {
            eknVar.write(c());
        }
        if (this.M == 14 && size % 2 == 1) {
            eknVar.a(0);
        }
        eknVar.b = java.nio.ByteOrder.BIG_ENDIAN;
        return size2;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x012c A[Catch: NumberFormatException -> 0x0147, TryCatch #1 {NumberFormatException -> 0x0147, blocks: (B:50:0x0103, B:52:0x0113, B:54:0x011d, B:55:0x012c, B:57:0x0131, B:58:0x013d), top: B:66:0x0103 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0131 A[Catch: NumberFormatException -> 0x0147, TryCatch #1 {NumberFormatException -> 0x0147, blocks: (B:50:0x0103, B:52:0x0113, B:54:0x011d, B:55:0x012c, B:57:0x0131, B:58:0x013d), top: B:66:0x0103 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x013d A[Catch: NumberFormatException -> 0x0147, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x0147, blocks: (B:50:0x0103, B:52:0x0113, B:54:0x011d, B:55:0x012c, B:57:0x0131, B:58:0x013d), top: B:66:0x0103 }] */
    private static android.util.Pair g(java.lang.String str) {
        android.util.Pair pair;
        if (str.contains(",")) {
            java.lang.String[] strArrSplit = str.split(",", -1);
            android.util.Pair pairG = g(strArrSplit[0]);
            if (((java.lang.Integer) pairG.first).intValue() == 2) {
                return pairG;
            }
            for (int i2 = 1; i2 < strArrSplit.length; i2++) {
                android.util.Pair pairG2 = g(strArrSplit[i2]);
                int iIntValue = (((java.lang.Integer) pairG2.first).equals(pairG.first) || ((java.lang.Integer) pairG2.second).equals(pairG.first)) ? ((java.lang.Integer) pairG.first).intValue() : -1;
                int iIntValue2 = (((java.lang.Integer) pairG.second).intValue() == -1 || !(((java.lang.Integer) pairG2.first).equals(pairG.second) || ((java.lang.Integer) pairG2.second).equals(pairG.second))) ? -1 : ((java.lang.Integer) pairG.second).intValue();
                if (iIntValue == -1) {
                    if (iIntValue2 == -1) {
                        return new android.util.Pair(2, -1);
                    }
                    iIntValue = -1;
                }
                if (iIntValue == -1) {
                    pairG = new android.util.Pair(java.lang.Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairG = new android.util.Pair(java.lang.Integer.valueOf(iIntValue), -1);
                }
            }
            return pairG;
        }
        if (str.contains("/")) {
            java.lang.String[] strArrSplit2 = str.split("/", -1);
            if (strArrSplit2.length == 2) {
                try {
                    long j2 = (long) java.lang.Double.parseDouble(strArrSplit2[0]);
                    long j3 = (long) java.lang.Double.parseDouble(strArrSplit2[1]);
                    if (j2 < 0 || j3 < 0) {
                        return new android.util.Pair(10, -1);
                    }
                    return (j2 > 2147483647L || j3 > 2147483647L) ? new android.util.Pair(5, -1) : new android.util.Pair(10, 5);
                } catch (java.lang.NumberFormatException unused) {
                }
            }
            return new android.util.Pair(2, -1);
        }
        try {
            try {
                long j4 = java.lang.Long.parseLong(str);
                java.lang.Long lValueOf = java.lang.Long.valueOf(j4);
                lValueOf.getClass();
                if (j4 >= 0) {
                    lValueOf.getClass();
                    if (j4 <= 65535) {
                        pair = new android.util.Pair(3, 4);
                    } else {
                        lValueOf.getClass();
                        if (j4 < 0) {
                            pair = new android.util.Pair(9, -1);
                        } else {
                            pair = new android.util.Pair(4, -1);
                        }
                    }
                } else {
                    lValueOf.getClass();
                    if (j4 < 0) {
                        pair = new android.util.Pair(9, -1);
                    } else {
                        pair = new android.util.Pair(4, -1);
                    }
                }
                return pair;
            } catch (java.lang.NumberFormatException unused2) {
                return new android.util.Pair(2, -1);
            }
        } catch (java.lang.NumberFormatException unused3) {
            java.lang.Double.parseDouble(str);
            return new android.util.Pair(12, -1);
        }
    }

    private final defpackage.eko h(java.lang.String str) {
        defpackage.eko ekoVar;
        int i2;
        defpackage.eko ekoVar2;
        if ("ISOSpeedRatings".equals(str)) {
            if (k) {
                android.util.Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        int i3 = 0;
        if ("Xmp".equals(str) && (i2 = this.M) != 4 && ((i2 == 9 || i2 == 15 || i2 == 12 || i2 == 13) && (ekoVar2 = this.ab) != null)) {
            return ekoVar2;
        }
        while (true) {
            int length = j.length;
            if (i3 >= 10) {
                if (!"Xmp".equals(str) || (ekoVar = this.ab) == null) {
                    return null;
                }
                return ekoVar;
            }
            defpackage.eko ekoVar3 = (defpackage.eko) this.N[i3].get(str);
            if (ekoVar3 != null) {
                return ekoVar3;
            }
            i3++;
        }
    }

    private final void i() throws java.lang.Throwable {
        java.lang.String strA = a("DateTimeOriginal");
        if (strA != null && a("DateTime") == null) {
            this.N[0].put("DateTime", defpackage.eko.c(strA));
        }
        if (a("ImageWidth") == null) {
            this.N[0].put("ImageWidth", defpackage.eko.d(0L, this.P));
        }
        if (a("ImageLength") == null) {
            this.N[0].put("ImageLength", defpackage.eko.d(0L, this.P));
        }
        if (a("Orientation") == null) {
            this.N[0].put("Orientation", defpackage.eko.d(0L, this.P));
        }
        if (a("LightSource") == null) {
            this.N[1].put("LightSource", defpackage.eko.d(0L, this.P));
        }
    }

    private final void j(defpackage.ekm ekmVar, int i2, int i3) throws java.lang.Throwable {
        boolean z2;
        boolean z3 = k;
        if (z3) {
            java.util.Objects.toString(ekmVar);
            android.util.Log.d("ExifInterface", "getJpegAttributes starting with: ".concat(ekmVar.toString()));
        }
        ekmVar.c = java.nio.ByteOrder.BIG_ENDIAN;
        byte b2 = ekmVar.readByte();
        byte b3 = -1;
        if (b2 != -1) {
            throw new java.io.IOException("Invalid marker: ".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(b2 & 255))));
        }
        if (ekmVar.readByte() != -40) {
            throw new java.io.IOException("Invalid marker: ff");
        }
        int i4 = 2;
        while (true) {
            byte b4 = ekmVar.readByte();
            if (b4 != b3) {
                throw new java.io.IOException("Invalid marker:".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(b4 & 255))));
            }
            while (true) {
                byte b5 = ekmVar.readByte();
                int i5 = i4 + 1;
                if (b5 != b3) {
                    int i6 = 0;
                    if (z3) {
                        android.util.Log.d("ExifInterface", "Found JPEG segment indicator: ".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(b5 & 255))));
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (b5 == -39 || b5 == -38) {
                        ekmVar.c = this.P;
                        return;
                    }
                    int unsignedShort = ekmVar.readUnsignedShort();
                    int i7 = unsignedShort - 2;
                    int i8 = i4 + 4;
                    if (z2) {
                        android.util.Log.d("ExifInterface", "JPEG segment: " + java.lang.Integer.toHexString(b5 & 255) + " (length: " + unsignedShort + ')');
                    }
                    if (i7 < 0) {
                        throw new java.io.IOException("Invalid length");
                    }
                    if (b5 == -31) {
                        byte[] bArr = new byte[i7];
                        ekmVar.readFully(bArr);
                        int i9 = i8 + i7;
                        byte[] bArr2 = i;
                        if (defpackage.zb.n(bArr, bArr2)) {
                            int length = bArr2.length;
                            byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, length, i7);
                            this.X = i2 + i8 + length;
                            r(bArrCopyOfRange, i3);
                            v(new defpackage.ekm(bArrCopyOfRange));
                        } else {
                            byte[] bArr3 = I;
                            if (defpackage.zb.n(bArr, bArr3)) {
                                int length2 = bArr3.length;
                                byte[] bArrCopyOfRange2 = java.util.Arrays.copyOfRange(bArr, length2, i7);
                                this.ab = new defpackage.eko(1, bArrCopyOfRange2.length, i8 + length2, bArrCopyOfRange2);
                                this.ac = true;
                            }
                        }
                        i8 = i9;
                    } else if (b5 != -2) {
                        switch (b5) {
                            case -64:
                            case -63:
                            case -62:
                            case -61:
                                break;
                            default:
                                switch (b5) {
                                    case -59:
                                    case -58:
                                    case -57:
                                        break;
                                    default:
                                        switch (b5) {
                                            case -55:
                                            case -54:
                                            case -53:
                                                break;
                                            default:
                                                switch (b5) {
                                                    case -51:
                                                    case -50:
                                                    case -49:
                                                        break;
                                                    default:
                                                        i6 = i7;
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        ekmVar.b(1);
                        java.util.HashMap[] mapArr = this.N;
                        mapArr[i3].put(i3 != 4 ? "ImageLength" : "ThumbnailImageLength", defpackage.eko.d(ekmVar.readUnsignedShort(), this.P));
                        mapArr[i3].put(i3 != 4 ? "ImageWidth" : "ThumbnailImageWidth", defpackage.eko.d(ekmVar.readUnsignedShort(), this.P));
                        i6 = unsignedShort - 7;
                    } else {
                        byte[] bArr4 = new byte[i7];
                        ekmVar.readFully(bArr4);
                        if (a("UserComment") == null) {
                            this.N[1].put("UserComment", defpackage.eko.c(new java.lang.String(bArr4, h)));
                        }
                    }
                    if (i6 < 0) {
                        throw new java.io.IOException("Invalid length");
                    }
                    ekmVar.b(i6);
                    i4 = i8 + i6;
                    b3 = -1;
                } else {
                    i4 = i5;
                }
            }
        }
    }

    private final void k(defpackage.ekm ekmVar) throws java.lang.Throwable {
        byte[] bArr;
        int length;
        if (k) {
            java.util.Objects.toString(ekmVar);
            android.util.Log.d("ExifInterface", "getPngAttributes starting with: ".concat(ekmVar.toString()));
        }
        ekmVar.c = java.nio.ByteOrder.BIG_ENDIAN;
        int i2 = ekmVar.b;
        int length2 = s.length;
        ekmVar.b(8);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (z2 && z3) {
                break;
            }
            try {
                int i3 = ekmVar.readInt();
                int i4 = ekmVar.readInt();
                int i5 = ekmVar.b;
                int i6 = i5 + i3;
                int i7 = i5 - i2;
                if (i7 == 16) {
                    if (i4 != 1229472850) {
                        throw new java.io.IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                    }
                    i7 = 16;
                }
                if (i4 == 1229278788) {
                    break;
                }
                if (i4 == 1700284774) {
                    if (z2) {
                        continue;
                    } else {
                        this.X = i7;
                        byte[] bArr2 = new byte[i3];
                        ekmVar.readFully(bArr2);
                        int i8 = ekmVar.readInt();
                        java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
                        x(crc32, 1700284774);
                        crc32.update(bArr2);
                        if (((int) crc32.getValue()) != i8) {
                            throw new java.io.IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i8 + ", calculated CRC value: " + crc32.getValue());
                        }
                        r(bArr2, 0);
                        y();
                        v(new defpackage.ekm(bArr2));
                        z2 = true;
                    }
                } else if (i4 == 1767135348 && !z3 && i3 >= (length = (bArr = d).length)) {
                    byte[] bArr3 = new byte[length];
                    ekmVar.readFully(bArr3);
                    if (java.util.Arrays.equals(bArr3, bArr)) {
                        int i9 = ekmVar.b - i2;
                        int i10 = i3 - length;
                        byte[] bArr4 = new byte[i10];
                        ekmVar.readFully(bArr4);
                        this.ab = new defpackage.eko(1, i10, i9, bArr4);
                        z3 = true;
                    }
                }
                ekmVar.b((i6 + 4) - ekmVar.b);
            } catch (java.io.EOFException e2) {
                throw new java.io.IOException("Encountered corrupt PNG file.", e2);
            }
        }
        this.ac = z3;
    }

    private final void l(defpackage.ekm ekmVar) throws java.lang.Throwable {
        if (k) {
            java.util.Objects.toString(ekmVar);
            android.util.Log.d("ExifInterface", "getWebpAttributes starting with: ".concat(ekmVar.toString()));
        }
        ekmVar.c = java.nio.ByteOrder.LITTLE_ENDIAN;
        int length = t.length;
        ekmVar.b(4);
        int i2 = ekmVar.readInt() + 8;
        int length2 = u.length;
        ekmVar.b(4);
        int i3 = 12;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                ekmVar.readFully(bArr);
                int i4 = ekmVar.readInt();
                int i5 = i3 + 8;
                if (java.util.Arrays.equals(v, bArr)) {
                    byte[] bArrCopyOfRange = new byte[i4];
                    ekmVar.readFully(bArrCopyOfRange);
                    byte[] bArr2 = i;
                    if (defpackage.zb.n(bArrCopyOfRange, bArr2)) {
                        bArrCopyOfRange = java.util.Arrays.copyOfRange(bArrCopyOfRange, bArr2.length, i4);
                    }
                    this.X = i5;
                    r(bArrCopyOfRange, 0);
                    v(new defpackage.ekm(bArrCopyOfRange));
                    return;
                }
                if (i4 % 2 == 1) {
                    i4++;
                }
                i3 = i5 + i4;
                if (i3 == i2) {
                    return;
                }
                if (i3 > i2) {
                    throw new java.io.IOException("Encountered WebP file with invalid chunk size");
                }
                ekmVar.b(i4);
            } catch (java.io.EOFException e2) {
                throw new java.io.IOException("Encountered corrupt WebP file.", e2);
            }
        }
    }

    private final void m(defpackage.ekm ekmVar, java.util.HashMap map) throws java.lang.Throwable {
        defpackage.eko ekoVar = (defpackage.eko) map.get("JPEGInterchangeFormat");
        defpackage.eko ekoVar2 = (defpackage.eko) map.get("JPEGInterchangeFormatLength");
        if (ekoVar == null || ekoVar2 == null) {
            return;
        }
        int iA = ekoVar.a(this.P);
        int iA2 = ekoVar2.a(this.P);
        if (this.M == 7) {
            iA += this.Y;
        }
        if (iA > 0 && iA2 > 0) {
            this.Q = true;
            if (this.J == null && this.L == null && this.K == null) {
                byte[] bArr = new byte[iA2];
                ekmVar.b(iA);
                ekmVar.readFully(bArr);
                this.V = bArr;
            }
            this.T = iA;
            this.U = iA2;
        }
        if (k) {
            android.util.Log.d("ExifInterface", a.bf(iA2, iA, "Setting thumbnail attributes with offset: ", ", length: "));
        }
    }

    private final void n(defpackage.ekm ekmVar, java.util.HashMap map) throws java.io.IOException {
        int length;
        int length2;
        int i2;
        defpackage.eko ekoVar = (defpackage.eko) map.get("StripOffsets");
        defpackage.eko ekoVar2 = (defpackage.eko) map.get("StripByteCounts");
        if (ekoVar == null || ekoVar2 == null) {
            return;
        }
        long[] jArrO = defpackage.zb.o(ekoVar.j(this.P));
        long[] jArrO2 = defpackage.zb.o(ekoVar2.j(this.P));
        if (jArrO == null || (length = jArrO.length) == 0) {
            android.util.Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrO2 == null || (length2 = jArrO2.length) == 0) {
            android.util.Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (length != length2) {
            android.util.Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j2 = 0;
        for (long j3 : jArrO2) {
            j2 += j3;
        }
        int i3 = (int) j2;
        byte[] bArr = new byte[i3];
        this.S = true;
        this.R = true;
        this.Q = true;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int length3 = jArrO.length;
            if (i4 >= length3) {
                int i7 = i3;
                this.V = bArr;
                if (this.S) {
                    this.T = (int) jArrO[0];
                    this.U = i7;
                    return;
                }
                return;
            }
            int i8 = (int) jArrO[i4];
            int i9 = (int) jArrO2[i4];
            if (i4 < length3 - 1) {
                i2 = i3;
                if (i8 + i9 != jArrO[i4 + 1]) {
                    this.S = false;
                }
            } else {
                i2 = i3;
            }
            int i10 = i8 - i5;
            if (i10 < 0) {
                android.util.Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            try {
                ekmVar.b(i10);
                int i11 = i5 + i10;
                byte[] bArr2 = new byte[i9];
                try {
                    ekmVar.readFully(bArr2);
                    i4++;
                    i5 = i11 + i9;
                    java.lang.System.arraycopy(bArr2, 0, bArr, i6, i9);
                    i6 += i9;
                    i3 = i2;
                } catch (java.io.EOFException unused) {
                    android.util.Log.d("ExifInterface", a.bs(i9, "Failed to read ", " bytes."));
                    return;
                }
            } catch (java.io.EOFException unused2) {
                android.util.Log.d("ExifInterface", a.bs(i10, "Failed to skip ", " bytes."));
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:213:0x04a6 A[Catch: all -> 0x04b6, TRY_LEAVE, TryCatch #7 {all -> 0x04b6, blocks: (B:3:0x0009, B:5:0x0010, B:6:0x001c, B:7:0x0031, B:9:0x0043, B:11:0x004b, B:12:0x0057, B:14:0x005a, B:16:0x0062, B:26:0x0086, B:40:0x00af, B:53:0x00cc, B:55:0x00d1, B:58:0x00d9, B:60:0x00de, B:62:0x00e4, B:64:0x00e9, B:66:0x00ee, B:69:0x00fa, B:71:0x00ff, B:47:0x00c0, B:48:0x00c3, B:51:0x00c7, B:33:0x0094, B:34:0x0097, B:37:0x009b, B:77:0x0115, B:83:0x0124, B:88:0x0137, B:90:0x0148, B:92:0x0170, B:96:0x0181, B:99:0x019d, B:100:0x01ab, B:102:0x01b7, B:104:0x01c1, B:106:0x01c4, B:108:0x01cb, B:110:0x01d1, B:112:0x01d9, B:113:0x01dd, B:114:0x01f5, B:93:0x0176, B:95:0x017c, B:177:0x03b3, B:117:0x020c, B:118:0x0211, B:120:0x0215, B:121:0x0225, B:123:0x0236, B:124:0x0243, B:127:0x0259, B:130:0x0264, B:132:0x0268, B:133:0x026f, B:134:0x0270, B:176:0x03b0, B:183:0x03c8, B:184:0x03cb, B:185:0x03cc, B:187:0x03d5, B:189:0x03dd, B:192:0x03e6, B:193:0x03eb, B:195:0x03ef, B:196:0x03ff, B:198:0x044f, B:201:0x045b, B:203:0x0469, B:205:0x048d, B:206:0x0499, B:73:0x0104, B:75:0x010c, B:211:0x04a2, B:213:0x04a6), top: B:227:0x0009 }] */
    /* JADX WARN: Multi-variable type inference failed */
    private final void o(java.io.InputStream inputStream) throws java.lang.Throwable {
        java.lang.String strExtractMetadata;
        int i2;
        int i3;
        int iH;
        java.lang.String strExtractMetadata2;
        java.lang.String strExtractMetadata3;
        int i4;
        int i5;
        int i6;
        defpackage.ekm ekmVar;
        defpackage.ekm ekmVar2;
        int i7 = 0;
        while (true) {
            try {
                try {
                    try {
                        int length = j.length;
                        if (i7 >= 10) {
                            break;
                        }
                        this.N[i7] = new java.util.HashMap();
                        i7++;
                    } catch (java.lang.UnsupportedOperationException e2) {
                        e = e2;
                        if (k) {
                            android.util.Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                        }
                    }
                } catch (java.lang.Throwable th) {
                    i();
                    if (k) {
                        q();
                    }
                    throw th;
                }
            } catch (java.io.IOException e3) {
                e = e3;
                if (k) {
                    android.util.Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
            }
        }
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(inputStream, 5000);
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i8 = 0;
        while (true) {
            byte[] bArr2 = c;
            int length2 = bArr2.length;
            strExtractMetadata = null;
            defpackage.ekm ekmVar3 = null;
            defpackage.ekm ekmVar4 = null;
            if (i8 >= 3) {
                i2 = 3;
                i3 = 1;
                iH = 4;
                break;
            }
            i2 = 3;
            if (bArr[i8] != bArr2[i8]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(java.nio.charset.Charset.defaultCharset());
                int i9 = 0;
                while (true) {
                    if (i9 >= bytes.length) {
                        i3 = 1;
                        iH = 9;
                        break;
                    }
                    i3 = 1;
                    if (bArr[i9] != bytes[i9]) {
                        iH = H(bArr);
                        if (iH != 0) {
                            break;
                        }
                        try {
                            ekmVar = new defpackage.ekm(bArr);
                            try {
                                java.nio.ByteOrder byteOrderI = I(ekmVar);
                                this.P = byteOrderI;
                                ekmVar.c = byteOrderI;
                                short s2 = ekmVar.readShort();
                                java.lang.Object[] objArr = s2 == 20306 || s2 == 21330;
                                ekmVar.close();
                                if (objArr == true) {
                                    iH = 7;
                                    break;
                                }
                                try {
                                    ekmVar2 = new defpackage.ekm(bArr);
                                    try {
                                        java.nio.ByteOrder byteOrderI2 = I(ekmVar2);
                                        this.P = byteOrderI2;
                                        ekmVar2.c = byteOrderI2;
                                        short s3 = ekmVar2.readShort();
                                        ekmVar2.close();
                                        if (s3 == 85) {
                                            iH = 10;
                                            break;
                                        }
                                        int i10 = 0;
                                        while (true) {
                                            byte[] bArr3 = s;
                                            int length3 = bArr3.length;
                                            if (i10 >= 8) {
                                                iH = 13;
                                                break;
                                            }
                                            if (bArr[i10] != bArr3[i10]) {
                                                int i11 = 0;
                                                while (true) {
                                                    byte[] bArr4 = t;
                                                    int length4 = bArr4.length;
                                                    if (i11 >= 4) {
                                                        int i12 = 0;
                                                        while (true) {
                                                            byte[] bArr5 = u;
                                                            int length5 = bArr5.length;
                                                            if (i12 >= 4) {
                                                                iH = 14;
                                                                break;
                                                            } else {
                                                                int length6 = bArr4.length;
                                                                if (bArr[i12 + 8] == bArr5[i12]) {
                                                                    i12++;
                                                                }
                                                            }
                                                        }
                                                    } else if (bArr[i11] == bArr4[i11]) {
                                                        i11++;
                                                    }
                                                    iH = 0;
                                                    break;
                                                }
                                            }
                                            i10++;
                                        }
                                    } catch (java.lang.Exception unused) {
                                        if (ekmVar2 != null) {
                                            ekmVar2.close();
                                        }
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                        ekmVar3 = ekmVar2;
                                        if (ekmVar3 != null) {
                                            ekmVar3.close();
                                        }
                                        throw th;
                                    }
                                } catch (java.lang.Exception unused2) {
                                    ekmVar2 = null;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                }
                            } catch (java.lang.Exception unused3) {
                                if (ekmVar != null) {
                                    ekmVar.close();
                                }
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                ekmVar4 = ekmVar;
                                if (ekmVar4 != null) {
                                    ekmVar4.close();
                                }
                                throw th;
                            }
                        } catch (java.lang.Exception unused4) {
                            ekmVar = null;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                        }
                    } else {
                        i9++;
                    }
                }
            } else {
                i8++;
            }
        }
        this.M = iH;
        if (iH == 4 || iH == 9 || iH == 13 || iH == 14) {
            defpackage.ekm ekmVar5 = new defpackage.ekm(bufferedInputStream);
            int i13 = this.M;
            if (i13 == 4) {
                j(ekmVar5, 0, 0);
            } else if (i13 == 13) {
                k(ekmVar5);
            } else if (i13 == 9) {
                boolean z2 = k;
                if (z2) {
                    ekmVar5.toString();
                    android.util.Log.d("ExifInterface", "getRafAttributes starting with: ".concat(ekmVar5.toString()));
                }
                ekmVar5.b(84);
                byte[] bArr6 = new byte[4];
                byte[] bArr7 = new byte[4];
                byte[] bArr8 = new byte[4];
                ekmVar5.readFully(bArr6);
                ekmVar5.readFully(bArr7);
                ekmVar5.readFully(bArr8);
                int i14 = java.nio.ByteBuffer.wrap(bArr6).getInt();
                int i15 = java.nio.ByteBuffer.wrap(bArr7).getInt();
                int i16 = java.nio.ByteBuffer.wrap(bArr8).getInt();
                byte[] bArr9 = new byte[i15];
                ekmVar5.b(i14 - ekmVar5.b);
                ekmVar5.readFully(bArr9);
                j(new defpackage.ekm(bArr9), i14, 5);
                ekmVar5.b(i16 - ekmVar5.b);
                ekmVar5.c = java.nio.ByteOrder.BIG_ENDIAN;
                int i17 = ekmVar5.readInt();
                if (z2) {
                    android.util.Log.d("ExifInterface", a.bj(i17, "numberOfDirectoryEntry: "));
                }
                for (int i18 = 0; i18 < i17; i18++) {
                    int unsignedShort = ekmVar5.readUnsignedShort();
                    int unsignedShort2 = ekmVar5.readUnsignedShort();
                    if (unsignedShort == ai.b) {
                        short s4 = ekmVar5.readShort();
                        short s5 = ekmVar5.readShort();
                        defpackage.eko ekoVarH = defpackage.eko.h(s4, this.P);
                        defpackage.eko ekoVarH2 = defpackage.eko.h(s5, this.P);
                        java.util.HashMap[] mapArr = this.N;
                        mapArr[0].put("ImageLength", ekoVarH);
                        mapArr[0].put("ImageWidth", ekoVarH2);
                        if (!z2) {
                            break;
                        }
                        android.util.Log.d("ExifInterface", a.bf(s5, s4, "Updated to length: ", ", width: "));
                        break;
                    }
                    ekmVar5.b(unsignedShort2);
                }
            } else if (i13 == 14) {
                l(ekmVar5);
            }
        } else {
            defpackage.ekm ekmVar6 = new defpackage.ekm(bufferedInputStream, (byte[]) null);
            int i19 = this.M;
            if (i19 == 12 || i19 == 15) {
                if (i19 == 15 && android.os.Build.VERSION.SDK_INT < 31) {
                    throw new java.lang.UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
                }
                android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
                try {
                    try {
                        mediaMetadataRetriever.setDataSource(new defpackage.ekl(ekmVar6));
                        java.lang.String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                        java.lang.String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                        java.lang.String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                        java.lang.String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                        if ("yes".equals(strExtractMetadata6)) {
                            strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                            java.lang.String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(30);
                            strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                            strExtractMetadata2 = strExtractMetadata8;
                        } else if ("yes".equals(strExtractMetadata7)) {
                            strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                            strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                            strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                        } else {
                            strExtractMetadata2 = null;
                            strExtractMetadata3 = null;
                        }
                        if (strExtractMetadata != null) {
                            this.N[0].put("ImageWidth", defpackage.eko.h(java.lang.Integer.parseInt(strExtractMetadata), this.P));
                        }
                        if (strExtractMetadata2 != null) {
                            this.N[0].put("ImageLength", defpackage.eko.h(java.lang.Integer.parseInt(strExtractMetadata2), this.P));
                        }
                        if (strExtractMetadata3 != null) {
                            int i20 = java.lang.Integer.parseInt(strExtractMetadata3);
                            if (i20 == 90) {
                                i4 = 6;
                            } else if (i20 != 180) {
                                i4 = i20 != 270 ? i3 : 8;
                            } else {
                                i4 = i2;
                            }
                            this.N[0].put("Orientation", defpackage.eko.h(i4, this.P));
                        }
                        if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                            int i21 = java.lang.Integer.parseInt(strExtractMetadata4);
                            int i22 = java.lang.Integer.parseInt(strExtractMetadata5);
                            if (i22 <= 6) {
                                throw new java.io.IOException("Invalid exif length");
                            }
                            ekmVar6.c(i21);
                            byte[] bArr10 = new byte[6];
                            ekmVar6.readFully(bArr10);
                            int i23 = i21 + 6;
                            int i24 = i22 - 6;
                            if (!java.util.Arrays.equals(bArr10, i)) {
                                throw new java.io.IOException("Invalid identifier");
                            }
                            byte[] bArr11 = new byte[i24];
                            ekmVar6.readFully(bArr11);
                            this.X = i23;
                            r(bArr11, 0);
                        }
                        java.lang.String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(41);
                        java.lang.String strExtractMetadata10 = mediaMetadataRetriever.extractMetadata(42);
                        if (strExtractMetadata9 != null && strExtractMetadata10 != null) {
                            int i25 = java.lang.Integer.parseInt(strExtractMetadata9);
                            int i26 = java.lang.Integer.parseInt(strExtractMetadata10);
                            long j2 = i25;
                            ekmVar6.c(j2);
                            byte[] bArr12 = new byte[i26];
                            ekmVar6.readFully(bArr12);
                            this.ab = new defpackage.eko(1, i26, j2, bArr12);
                            this.ac = i3;
                        }
                        if (k) {
                            android.util.Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + 'x' + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                        }
                        try {
                            mediaMetadataRetriever.release();
                        } catch (java.io.IOException unused5) {
                        }
                    } catch (java.lang.Throwable th6) {
                        try {
                            mediaMetadataRetriever.release();
                        } catch (java.io.IOException unused6) {
                        }
                        throw th6;
                    }
                } catch (java.lang.RuntimeException e4) {
                    throw new java.lang.UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e4);
                }
            } else if (i19 == 7) {
                D(ekmVar6);
                java.util.HashMap[] mapArr2 = this.N;
                defpackage.eko ekoVar = (defpackage.eko) mapArr2[i3].get("MakerNote");
                if (ekoVar != null) {
                    defpackage.ekm ekmVar7 = new defpackage.ekm(ekoVar.d, (byte[]) null);
                    ekmVar7.c = this.P;
                    byte[] bArr13 = q;
                    int length7 = bArr13.length;
                    byte[] bArr14 = new byte[6];
                    ekmVar7.readFully(bArr14);
                    ekmVar7.c(0L);
                    byte[] bArr15 = r;
                    int length8 = bArr15.length;
                    byte[] bArr16 = new byte[10];
                    ekmVar7.readFully(bArr16);
                    if (java.util.Arrays.equals(bArr14, bArr13)) {
                        ekmVar7.c(8L);
                    } else if (java.util.Arrays.equals(bArr16, bArr15)) {
                        ekmVar7.c(12L);
                    }
                    E(ekmVar7, 6);
                    defpackage.eko ekoVar2 = (defpackage.eko) mapArr2[7].get("PreviewImageStart");
                    defpackage.eko ekoVar3 = (defpackage.eko) mapArr2[7].get("PreviewImageLength");
                    if (ekoVar2 != null && ekoVar3 != null) {
                        mapArr2[5].put("JPEGInterchangeFormat", ekoVar2);
                        mapArr2[5].put("JPEGInterchangeFormatLength", ekoVar3);
                    }
                    defpackage.eko ekoVar4 = (defpackage.eko) mapArr2[8].get("AspectFrame");
                    if (ekoVar4 != null) {
                        int[] iArr = (int[]) ekoVar4.j(this.P);
                        if (iArr == null || iArr.length != 4) {
                            android.util.Log.w("ExifInterface", "Invalid aspect frame values. frame=".concat(java.lang.String.valueOf(java.util.Arrays.toString(iArr))));
                        } else {
                            int i27 = iArr[2];
                            int i28 = iArr[0];
                            if (i27 > i28 && (i5 = iArr[i2]) > (i6 = iArr[i3])) {
                                int i29 = (i27 - i28) + 1;
                                int i30 = (i5 - i6) + 1;
                                if (i29 < i30) {
                                    int i31 = i29 + i30;
                                    i30 = i31 - i30;
                                    i29 = i31 - i30;
                                }
                                defpackage.eko ekoVarH3 = defpackage.eko.h(i29, this.P);
                                defpackage.eko ekoVarH4 = defpackage.eko.h(i30, this.P);
                                mapArr2[0].put("ImageWidth", ekoVarH3);
                                mapArr2[0].put("ImageLength", ekoVarH4);
                            }
                        }
                    }
                }
            } else if (i19 != 10) {
                D(ekmVar6);
            } else {
                if (k) {
                    ekmVar6.toString();
                    android.util.Log.d("ExifInterface", "getRw2Attributes starting with: ".concat(ekmVar6.toString()));
                }
                D(ekmVar6);
                java.util.HashMap[] mapArr3 = this.N;
                defpackage.eko ekoVar5 = (defpackage.eko) mapArr3[0].get("JpgFromRaw");
                if (ekoVar5 != null) {
                    j(new defpackage.ekm(ekoVar5.d), (int) ekoVar5.c, 5);
                }
                defpackage.eko ekoVar6 = (defpackage.eko) mapArr3[0].get("ISO");
                defpackage.eko ekoVar7 = (defpackage.eko) mapArr3[i3].get("PhotographicSensitivity");
                if (ekoVar6 != null && ekoVar7 == null) {
                    mapArr3[i3].put("PhotographicSensitivity", ekoVar6);
                }
            }
            ekmVar6.c(this.X);
            v(ekmVar6);
        }
        i();
        if (k) {
            q();
        }
    }

    private final void p(defpackage.ekm ekmVar) throws java.io.IOException {
        java.nio.ByteOrder byteOrderI = I(ekmVar);
        this.P = byteOrderI;
        ekmVar.c = byteOrderI;
        int unsignedShort = ekmVar.readUnsignedShort();
        int i2 = this.M;
        if (i2 != 7 && i2 != 10 && unsignedShort != 42) {
            throw new java.io.IOException("Invalid start code: ".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(unsignedShort))));
        }
        int i3 = ekmVar.readInt();
        if (i3 < 8) {
            throw new java.io.IOException(a.bj(i3, "Invalid first Ifd offset: "));
        }
        int i4 = i3 - 8;
        if (i4 > 0) {
            ekmVar.b(i4);
        }
    }

    private final void q() {
        for (int i2 = 0; i2 < 10; i2++) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The size of tag group[");
            sb.append(i2);
            sb.append("]: ");
            java.util.HashMap[] mapArr = this.N;
            sb.append(mapArr[i2].size());
            android.util.Log.d("ExifInterface", sb.toString());
            for (java.util.Map.Entry entry : mapArr[i2].entrySet()) {
                defpackage.eko ekoVar = (defpackage.eko) entry.getValue();
                android.util.Log.d("ExifInterface", "tagName: " + ((java.lang.String) entry.getKey()) + ", tagType: " + ekoVar.toString() + ", tagValue: '" + ekoVar.k(this.P) + '\'');
            }
        }
    }

    private final void r(byte[] bArr, int i2) throws java.io.IOException {
        defpackage.ekm ekmVar = new defpackage.ekm(bArr, (byte[]) null);
        p(ekmVar);
        E(ekmVar, i2);
    }

    private final void s(java.lang.String str) {
        int i2 = 0;
        while (true) {
            int length = j.length;
            if (i2 >= 10) {
                return;
            }
            this.N[i2].remove(str);
            i2++;
        }
    }

    private final void t(int i2, java.lang.String str, java.lang.String str2) {
        java.util.HashMap[] mapArr = this.N;
        if (mapArr[i2].isEmpty() || mapArr[i2].get(str) == null) {
            return;
        }
        java.util.HashMap map = mapArr[i2];
        map.put(str2, (defpackage.eko) map.get(str));
        mapArr[i2].remove(str);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x01e9 A[Catch: all -> 0x01fc, Exception -> 0x01ff, TryCatch #5 {Exception -> 0x01ff, all -> 0x01fc, blocks: (B:7:0x003e, B:9:0x004b, B:11:0x005b, B:12:0x005d, B:68:0x01ce, B:70:0x01e9, B:71:0x01f2, B:13:0x0065, B:15:0x0074, B:17:0x007c, B:19:0x0080, B:21:0x0098, B:22:0x009d, B:23:0x009f, B:25:0x00aa, B:26:0x00ae, B:27:0x00b3, B:29:0x00c3, B:31:0x00cb, B:35:0x00dc, B:37:0x00e4, B:40:0x00eb, B:42:0x00fa, B:44:0x010c, B:58:0x015e, B:60:0x016a, B:61:0x0171, B:63:0x01ab, B:67:0x01c7, B:64:0x01b7, B:66:0x01bf, B:45:0x011d, B:46:0x0124, B:47:0x0125, B:49:0x0131, B:51:0x0137, B:54:0x014d, B:55:0x0150, B:56:0x0157), top: B:89:0x003e }] */
    private final void u(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.lang.Throwable {
        char c2;
        int i2;
        int i3;
        int i4;
        int i5;
        int iF;
        if (k) {
            android.util.Log.d("ExifInterface", a.bm((byte) 41, outputStream, inputStream, "saveWebpAttributes starting with (inputStream: ", ", outputStream: "));
        }
        defpackage.ekm ekmVar = new defpackage.ekm(inputStream, java.nio.ByteOrder.LITTLE_ENDIAN);
        defpackage.ekn eknVar = new defpackage.ekn(outputStream, java.nio.ByteOrder.LITTLE_ENDIAN);
        int length = t.length;
        defpackage.zb.m(ekmVar, eknVar, 4);
        int i6 = ekmVar.readInt();
        int length2 = u.length;
        ekmVar.b(4);
        java.io.ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
                try {
                    defpackage.ekn eknVar2 = new defpackage.ekn(byteArrayOutputStream2, java.nio.ByteOrder.LITTLE_ENDIAN);
                    int i7 = this.X;
                    if (i7 == 0) {
                        byte[] bArr = new byte[4];
                        ekmVar.readFully(bArr);
                        byte[] bArr2 = x;
                        if (java.util.Arrays.equals(bArr, bArr2)) {
                            int i8 = ekmVar.readInt();
                            byte[] bArr3 = new byte[i8 % 2 == 1 ? i8 + 1 : i8];
                            ekmVar.readFully(bArr3);
                            byte b2 = (byte) (bArr3[0] | 8);
                            bArr3[0] = b2;
                            int i9 = (b2 >> 1) & 1;
                            eknVar2.write(bArr2);
                            eknVar2.b(i8);
                            eknVar2.write(bArr3);
                            if (i9 != 0) {
                                J(ekmVar, eknVar2, A, null);
                                while (true) {
                                    byte[] bArr4 = new byte[4];
                                    try {
                                        ekmVar.readFully(bArr4);
                                        if (!java.util.Arrays.equals(bArr4, B)) {
                                            break;
                                        } else {
                                            G(ekmVar, eknVar2, bArr4);
                                        }
                                    } catch (java.io.EOFException unused) {
                                    }
                                }
                                iF = f(eknVar2);
                            } else {
                                J(ekmVar, eknVar2, z, y);
                                iF = f(eknVar2);
                            }
                        } else {
                            byte[] bArr5 = z;
                            if (java.util.Arrays.equals(bArr, bArr5) || java.util.Arrays.equals(bArr, y)) {
                                int i10 = ekmVar.readInt();
                                int i11 = i10 % 2 == 1 ? i10 + 1 : i10;
                                byte[] bArr6 = new byte[3];
                                boolean z2 = true;
                                if (java.util.Arrays.equals(bArr, bArr5)) {
                                    ekmVar.readFully(bArr6);
                                    byte[] bArr7 = new byte[3];
                                    ekmVar.readFully(bArr7);
                                    c2 = 0;
                                    if (!java.util.Arrays.equals(w, bArr7)) {
                                        throw new java.io.IOException("Error checking VP8 signature");
                                    }
                                    i3 = ekmVar.readInt();
                                    i5 = i3 & 16383;
                                    i2 = -1;
                                    i4 = (i3 >> 16) & 16383;
                                    i11 -= 10;
                                    z2 = false;
                                } else {
                                    c2 = 0;
                                    i2 = -1;
                                    if (!java.util.Arrays.equals(bArr, y)) {
                                        i3 = 0;
                                        i4 = 0;
                                        i5 = 0;
                                        z2 = false;
                                    } else {
                                        if (ekmVar.readByte() != 47) {
                                            throw new java.io.IOException("Error checking VP8L signature");
                                        }
                                        i3 = ekmVar.readInt();
                                        i5 = (i3 & 16383) + 1;
                                        i4 = ((i3 >>> 14) & 16383) + 1;
                                        if ((i3 & 268435456) == 0) {
                                            z2 = false;
                                        }
                                        i11 -= 5;
                                    }
                                }
                                eknVar2.write(bArr2);
                                eknVar2.b(10);
                                byte[] bArr8 = new byte[10];
                                if (z2) {
                                    bArr8[c2] = (byte) (bArr8[c2] | 16);
                                }
                                bArr8[c2] = (byte) (bArr8[c2] | 8);
                                int i12 = i5 - 1;
                                int i13 = i4 - 1;
                                bArr8[4] = (byte) i12;
                                bArr8[5] = (byte) (i12 >> 8);
                                bArr8[6] = (byte) (i12 >> 16);
                                bArr8[7] = (byte) i13;
                                bArr8[8] = (byte) (i13 >> 8);
                                bArr8[9] = (byte) (i13 >> 16);
                                eknVar2.write(bArr8);
                                eknVar2.write(bArr);
                                eknVar2.b(i10);
                                if (java.util.Arrays.equals(bArr, bArr5)) {
                                    eknVar2.write(bArr6);
                                    eknVar2.write(w);
                                    eknVar2.b(i3);
                                } else if (java.util.Arrays.equals(bArr, y)) {
                                    eknVar2.write(47);
                                    eknVar2.b(i3);
                                }
                                defpackage.zb.m(ekmVar, eknVar2, i11);
                                iF = f(eknVar2);
                            } else {
                                iF = -1;
                                i2 = -1;
                            }
                        }
                        defpackage.zb.m(ekmVar, eknVar2, (i6 + 8) - ekmVar.b);
                        int size = byteArrayOutputStream2.size();
                        byte[] bArr9 = u;
                        int length3 = bArr9.length;
                        eknVar.b(size + 4);
                        eknVar.write(bArr9);
                        if (iF != i2) {
                            this.X = eknVar.a.size() + iF;
                        }
                        byteArrayOutputStream2.writeTo(eknVar);
                        defpackage.zb.p(ekmVar, eknVar);
                        mni.bg(byteArrayOutputStream2);
                    }
                    defpackage.zb.m(ekmVar, eknVar2, i7 - 20);
                    ekmVar.b(4);
                    int i14 = ekmVar.readInt();
                    if (i14 % 2 != 0) {
                        i14++;
                    }
                    ekmVar.b(i14);
                    iF = f(eknVar2);
                    i2 = -1;
                    defpackage.zb.m(ekmVar, eknVar2, (i6 + 8) - ekmVar.b);
                    int size2 = byteArrayOutputStream2.size();
                    byte[] bArr10 = u;
                    int length4 = bArr10.length;
                    eknVar.b(size2 + 4);
                    eknVar.write(bArr10);
                    if (iF != i2) {
                        this.X = eknVar.a.size() + iF;
                    }
                    byteArrayOutputStream2.writeTo(eknVar);
                    defpackage.zb.p(ekmVar, eknVar);
                    mni.bg(byteArrayOutputStream2);
                } catch (java.lang.Exception e2) {
                    e = e2;
                    throw new java.io.IOException("Failed to save WebP file", e);
                } catch (java.lang.Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    mni.bg(byteArrayOutputStream);
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Exception e3) {
            e = e3;
        }
    }

    private final void v(defpackage.ekm ekmVar) throws java.lang.Throwable {
        defpackage.eko ekoVar;
        int iA;
        java.util.HashMap map = this.N[4];
        defpackage.eko ekoVar2 = (defpackage.eko) map.get("Compression");
        if (ekoVar2 == null) {
            this.W = 6;
            m(ekmVar, map);
            return;
        }
        int iA2 = ekoVar2.a(this.P);
        this.W = iA2;
        if (iA2 != 1) {
            if (iA2 == 6) {
                m(ekmVar, map);
                return;
            } else if (iA2 != 7) {
                return;
            }
        }
        defpackage.eko ekoVar3 = (defpackage.eko) map.get("BitsPerSample");
        if (ekoVar3 != null) {
            int[] iArr = (int[]) ekoVar3.j(this.P);
            int[] iArr2 = a;
            if (java.util.Arrays.equals(iArr2, iArr) || (this.M == 3 && (ekoVar = (defpackage.eko) map.get("PhotometricInterpretation")) != null && ((iA = ekoVar.a(this.P)) != 1 ? !(iA != 6 || !java.util.Arrays.equals(iArr, iArr2)) : java.util.Arrays.equals(iArr, b)))) {
                n(ekmVar, map);
                return;
            }
        }
        if (k) {
            android.util.Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    private final void w(int i2, int i3) throws java.lang.Throwable {
        java.util.HashMap[] mapArr = this.N;
        if (mapArr[i2].isEmpty() || mapArr[i3].isEmpty()) {
            if (k) {
                android.util.Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        defpackage.eko ekoVar = (defpackage.eko) mapArr[i2].get("ImageLength");
        defpackage.eko ekoVar2 = (defpackage.eko) mapArr[i2].get("ImageWidth");
        defpackage.eko ekoVar3 = (defpackage.eko) mapArr[i3].get("ImageLength");
        defpackage.eko ekoVar4 = (defpackage.eko) mapArr[i3].get("ImageWidth");
        if (ekoVar == null || ekoVar2 == null) {
            if (k) {
                android.util.Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (ekoVar3 == null || ekoVar4 == null) {
            if (k) {
                android.util.Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iA = ekoVar.a(this.P);
        int iA2 = ekoVar2.a(this.P);
        int iA3 = ekoVar3.a(this.P);
        int iA4 = ekoVar4.a(this.P);
        if (iA >= iA3 || iA2 >= iA4) {
            return;
        }
        java.util.HashMap map = mapArr[i2];
        mapArr[i2] = mapArr[i3];
        mapArr[i3] = map;
    }

    private static void x(java.util.zip.CRC32 crc32, int i2) {
        crc32.update(i2 >>> 24);
        crc32.update(i2 >>> 16);
        crc32.update(i2 >>> 8);
        crc32.update(i2);
    }

    private final void y() throws java.lang.Throwable {
        w(0, 5);
        w(0, 4);
        w(5, 4);
        java.util.HashMap[] mapArr = this.N;
        defpackage.eko ekoVar = (defpackage.eko) mapArr[1].get("PixelXDimension");
        defpackage.eko ekoVar2 = (defpackage.eko) mapArr[1].get("PixelYDimension");
        if (ekoVar != null && ekoVar2 != null) {
            mapArr[0].put("ImageWidth", ekoVar);
            mapArr[0].put("ImageLength", ekoVar2);
        }
        if (mapArr[4].isEmpty() && C(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new java.util.HashMap();
        }
        if (!C(mapArr[4])) {
            android.util.Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        t(0, "ThumbnailOrientation", "Orientation");
        t(0, "ThumbnailImageLength", "ImageLength");
        t(0, "ThumbnailImageWidth", "ImageWidth");
        t(5, "ThumbnailOrientation", "Orientation");
        t(5, "ThumbnailImageLength", "ImageLength");
        t(5, "ThumbnailImageWidth", "ImageWidth");
        t(4, "Orientation", "ThumbnailOrientation");
        t(4, "ImageLength", "ThumbnailImageLength");
        t(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private final void z(defpackage.ekn eknVar) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        this.X = eknVar.a.size() + f(new defpackage.ekn(byteArrayOutputStream, java.nio.ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        eknVar.write(byteArray);
        java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        eknVar.b((int) crc32.getValue());
    }

    public final java.lang.String a(java.lang.String str) throws java.lang.Throwable {
        double d2;
        defpackage.eko ekoVarH = h(str);
        if (ekoVarH == null) {
            return null;
        }
        if (str.equals("GPSTimeStamp")) {
            int i2 = ekoVarH.a;
            if (i2 != 5 && i2 != 10) {
                android.util.Log.w("ExifInterface", a.bj(i2, "GPS Timestamp format is not rational. format="));
                return null;
            }
            defpackage.ekp[] ekpVarArr = (defpackage.ekp[]) ekoVarH.j(this.P);
            if (ekpVarArr == null || ekpVarArr.length != 3) {
                android.util.Log.w("ExifInterface", "Invalid GPS Timestamp array. array=".concat(java.lang.String.valueOf(java.util.Arrays.toString(ekpVarArr))));
                return null;
            }
            defpackage.ekp ekpVar = ekpVarArr[0];
            java.lang.Integer numValueOf = java.lang.Integer.valueOf((int) (ekpVar.a / ekpVar.b));
            defpackage.ekp ekpVar2 = ekpVarArr[1];
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf((int) (ekpVar2.a / ekpVar2.b));
            defpackage.ekp ekpVar3 = ekpVarArr[2];
            return java.lang.String.format("%02d:%02d:%02d", numValueOf, numValueOf2, java.lang.Integer.valueOf((int) (ekpVar3.a / ekpVar3.b)));
        }
        if (!G.contains(str)) {
            return ekoVarH.k(this.P);
        }
        try {
            java.lang.Object objJ = ekoVarH.j(this.P);
            if (objJ == null) {
                throw new java.lang.NumberFormatException("NULL can't be converted to a double value");
            }
            if (objJ instanceof java.lang.String) {
                d2 = java.lang.Double.parseDouble((java.lang.String) objJ);
            } else if (objJ instanceof long[]) {
                long[] jArr = (long[]) objJ;
                if (jArr.length != 1) {
                    throw new java.lang.NumberFormatException("There are more than one component");
                }
                d2 = jArr[0];
            } else if (objJ instanceof int[]) {
                int[] iArr = (int[]) objJ;
                if (iArr.length != 1) {
                    throw new java.lang.NumberFormatException("There are more than one component");
                }
                d2 = iArr[0];
            } else if (objJ instanceof double[]) {
                double[] dArr = (double[]) objJ;
                if (dArr.length != 1) {
                    throw new java.lang.NumberFormatException("There are more than one component");
                }
                d2 = dArr[0];
            } else {
                if (!(objJ instanceof defpackage.ekp[])) {
                    throw new java.lang.NumberFormatException("Couldn't find a double value");
                }
                defpackage.ekp[] ekpVarArr2 = (defpackage.ekp[]) objJ;
                if (ekpVarArr2.length != 1) {
                    throw new java.lang.NumberFormatException("There are more than one component");
                }
                defpackage.ekp ekpVar4 = ekpVarArr2[0];
                d2 = ekpVar4.a / ekpVar4.b;
            }
            return java.lang.Double.toString(d2);
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:141:0x025d A[Catch: all -> 0x02ba, Exception -> 0x02c0, TryCatch #19 {Exception -> 0x02c0, all -> 0x02ba, blocks: (B:43:0x00a3, B:48:0x00b1, B:49:0x00b6, B:51:0x00ba, B:52:0x00c3, B:54:0x00db, B:61:0x00e7, B:62:0x00ec, B:64:0x00fb, B:66:0x010a, B:67:0x010e, B:69:0x0112, B:71:0x0116, B:75:0x0121, B:79:0x0133, B:81:0x0138, B:83:0x0147, B:85:0x014b, B:86:0x014e, B:88:0x0155, B:90:0x0163, B:92:0x0172, B:94:0x0176, B:95:0x017f, B:98:0x0194, B:100:0x019f, B:102:0x01b4, B:103:0x01d4, B:104:0x01d8, B:106:0x01de, B:114:0x01f0, B:117:0x0203, B:119:0x020e, B:121:0x0218, B:122:0x021d, B:123:0x021e, B:125:0x0226, B:127:0x022b, B:133:0x0239, B:135:0x0244, B:138:0x024c, B:139:0x0252, B:141:0x025d, B:143:0x0264, B:128:0x022e, B:130:0x0233), top: B:254:0x00a3 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x0264 A[Catch: all -> 0x02ba, Exception -> 0x02c0, TRY_LEAVE, TryCatch #19 {Exception -> 0x02c0, all -> 0x02ba, blocks: (B:43:0x00a3, B:48:0x00b1, B:49:0x00b6, B:51:0x00ba, B:52:0x00c3, B:54:0x00db, B:61:0x00e7, B:62:0x00ec, B:64:0x00fb, B:66:0x010a, B:67:0x010e, B:69:0x0112, B:71:0x0116, B:75:0x0121, B:79:0x0133, B:81:0x0138, B:83:0x0147, B:85:0x014b, B:86:0x014e, B:88:0x0155, B:90:0x0163, B:92:0x0172, B:94:0x0176, B:95:0x017f, B:98:0x0194, B:100:0x019f, B:102:0x01b4, B:103:0x01d4, B:104:0x01d8, B:106:0x01de, B:114:0x01f0, B:117:0x0203, B:119:0x020e, B:121:0x0218, B:122:0x021d, B:123:0x021e, B:125:0x0226, B:127:0x022b, B:133:0x0239, B:135:0x0244, B:138:0x024c, B:139:0x0252, B:141:0x025d, B:143:0x0264, B:128:0x022e, B:130:0x0233), top: B:254:0x00a3 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x0271 A[Catch: all -> 0x02b6, Exception -> 0x02b8, LOOP:3: B:142:0x0262->B:147:0x0271, LOOP_END, TryCatch #20 {Exception -> 0x02b8, all -> 0x02b6, blocks: (B:145:0x026b, B:147:0x0271, B:150:0x0283, B:151:0x0289, B:152:0x028a, B:156:0x02a2, B:157:0x02a7, B:158:0x02a8, B:159:0x02ae, B:160:0x02af, B:161:0x02b5), top: B:253:0x0192 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x02f3 A[Catch: all -> 0x031f, Exception -> 0x0323, TryCatch #17 {Exception -> 0x0323, all -> 0x031f, blocks: (B:187:0x02ef, B:189:0x02f3, B:191:0x030b, B:190:0x02fa), top: B:257:0x02ef }] */
    /* JADX WARN: Code duplicated, block: B:190:0x02fa A[Catch: all -> 0x031f, Exception -> 0x0323, TryCatch #17 {Exception -> 0x0323, all -> 0x031f, blocks: (B:187:0x02ef, B:189:0x02f3, B:191:0x030b, B:190:0x02fa), top: B:257:0x02ef }] */
    /* JADX WARN: Code duplicated, block: B:214:0x0358  */
    /* JADX WARN: Code duplicated, block: B:281:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x027c A[SYNTHETIC] */
    public final void b() throws java.lang.Throwable {
        java.io.FileOutputStream fileOutputStream;
        java.io.FileInputStream fileInputStream;
        java.io.FileInputStream fileInputStream2;
        char c2;
        java.io.BufferedInputStream bufferedInputStream;
        java.io.BufferedOutputStream bufferedOutputStream;
        java.io.BufferedInputStream bufferedInputStream2;
        java.io.FileInputStream fileInputStream3;
        java.io.FileOutputStream fileOutputStream2;
        char c3;
        char c4;
        java.io.FileInputStream fileInputStream4;
        java.lang.String str;
        byte b2;
        byte[] bArr;
        int i2;
        int i3 = this.M;
        char c5 = 4;
        if (i3 != 4 && i3 != 13 && i3 != 14) {
            throw new java.io.IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (this.K == null && this.J == null) {
            throw new java.io.IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (this.Q && this.R && !this.S) {
            throw new java.io.IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        int i4 = this.W;
        this.V = (i4 == 6 || i4 == 7) ? c() : null;
        try {
            java.io.File fileCreateTempFile = java.io.File.createTempFile("temp", "tmp");
            java.lang.String str2 = this.J;
            if (str2 != null) {
                fileInputStream2 = new java.io.FileInputStream(str2);
            } else {
                android.system.Os.lseek(this.K, 0L, android.system.OsConstants.SEEK_SET);
                fileInputStream2 = new java.io.FileInputStream(this.K);
            }
            try {
                fileOutputStream = new java.io.FileOutputStream(fileCreateTempFile);
                try {
                    defpackage.zb.p(fileInputStream2, fileOutputStream);
                    mni.bg(fileInputStream2);
                    mni.bg(fileOutputStream);
                    try {
                        try {
                            java.io.FileInputStream fileInputStream5 = new java.io.FileInputStream(fileCreateTempFile);
                            try {
                                java.lang.String str3 = this.J;
                                if (str3 != null) {
                                    fileOutputStream2 = new java.io.FileOutputStream(str3);
                                } else {
                                    android.system.Os.lseek(this.K, 0L, android.system.OsConstants.SEEK_SET);
                                    fileOutputStream2 = new java.io.FileOutputStream(this.K);
                                }
                                try {
                                    java.io.BufferedInputStream bufferedInputStream3 = new java.io.BufferedInputStream(fileInputStream5);
                                    try {
                                        bufferedOutputStream = new java.io.BufferedOutputStream(fileOutputStream2);
                                        try {
                                            int i5 = this.M;
                                            c2 = ')';
                                            if (i5 == 4) {
                                                if (k) {
                                                    android.util.Log.d("ExifInterface", a.bm((byte) 41, bufferedOutputStream, bufferedInputStream3, "saveJpegAttributes starting with (inputStream: ", ", outputStream: "));
                                                }
                                                defpackage.ekm ekmVar = new defpackage.ekm(bufferedInputStream3);
                                                defpackage.ekn eknVar = new defpackage.ekn(bufferedOutputStream, java.nio.ByteOrder.BIG_ENDIAN);
                                                byte b3 = -1;
                                                try {
                                                    if (ekmVar.readByte() != -1) {
                                                        throw new java.io.IOException("Invalid marker");
                                                    }
                                                    eknVar.a(-1);
                                                    if (ekmVar.readByte() != -40) {
                                                        throw new java.io.IOException("Invalid marker");
                                                    }
                                                    eknVar.a(-40);
                                                    eknVar.a(-1);
                                                    byte b4 = -31;
                                                    eknVar.a(-31);
                                                    this.X = f(eknVar);
                                                    if (this.ab != null) {
                                                        eknVar.write(-1);
                                                        eknVar.a(-31);
                                                        byte[] bArr2 = I;
                                                        eknVar.e(bArr2.length + 2 + this.ab.d.length);
                                                        eknVar.write(bArr2);
                                                        eknVar.write(this.ab.d);
                                                        this.ac = true;
                                                    }
                                                    int i6 = 4096;
                                                    byte[] bArr3 = new byte[4096];
                                                    while (ekmVar.readByte() == b3) {
                                                        do {
                                                            b2 = ekmVar.readByte();
                                                        } while (b2 == b3);
                                                        if (b2 == -39 || b2 == -38) {
                                                            eknVar.a(b3);
                                                            eknVar.a(b2);
                                                            defpackage.zb.p(ekmVar, eknVar);
                                                        } else if (b2 != b4) {
                                                            eknVar.a(b3);
                                                            eknVar.a(b2);
                                                            int unsignedShort = ekmVar.readUnsignedShort();
                                                            eknVar.e(unsignedShort);
                                                            int i7 = unsignedShort - 2;
                                                            if (i7 < 0) {
                                                                throw new java.io.IOException("Invalid length");
                                                            }
                                                            while (i7 > 0) {
                                                                int i8 = ekmVar.read(bArr3, 0, java.lang.Math.min(i7, i6));
                                                                if (i8 < 0) {
                                                                    b4 = -31;
                                                                    break;
                                                                } else {
                                                                    eknVar.write(bArr3, 0, i8);
                                                                    i7 -= i8;
                                                                    b4 = -31;
                                                                }
                                                            }
                                                        } else {
                                                            int unsignedShort2 = ekmVar.readUnsignedShort();
                                                            int length = unsignedShort2 - 2;
                                                            if (length < 0) {
                                                                throw new java.io.IOException("Invalid length");
                                                            }
                                                            byte[] bArr4 = I;
                                                            int length2 = bArr4.length;
                                                            if (length >= length2) {
                                                                bArr = new byte[length2];
                                                            } else {
                                                                int length3 = i.length;
                                                                bArr = length >= length3 ? new byte[length3] : null;
                                                            }
                                                            if (bArr == null) {
                                                                eknVar.a(b3);
                                                                eknVar.a(b2);
                                                                eknVar.e(unsignedShort2);
                                                                if (bArr != null) {
                                                                    length -= bArr.length;
                                                                    eknVar.write(bArr);
                                                                }
                                                                while (true) {
                                                                    if (length <= 0) {
                                                                        i2 = ekmVar.read(bArr3, 0, java.lang.Math.min(length, 4096));
                                                                        if (i2 >= 0) {
                                                                            i6 = 4096;
                                                                            b4 = -31;
                                                                            b3 = -1;
                                                                            break;
                                                                            break;
                                                                        }
                                                                        eknVar.write(bArr3, 0, i2);
                                                                        length -= i2;
                                                                    } else {
                                                                        b4 = -31;
                                                                        b3 = -1;
                                                                        i6 = 4096;
                                                                        break;
                                                                        break;
                                                                    }
                                                                }
                                                            } else {
                                                                ekmVar.readFully(bArr);
                                                                if (!defpackage.zb.n(bArr, i) && !defpackage.zb.n(bArr, bArr4)) {
                                                                    b3 = -1;
                                                                    eknVar.a(b3);
                                                                    eknVar.a(b2);
                                                                    eknVar.e(unsignedShort2);
                                                                    if (bArr != null) {
                                                                        length -= bArr.length;
                                                                        eknVar.write(bArr);
                                                                    }
                                                                    while (true) {
                                                                        if (length <= 0) {
                                                                            i2 = ekmVar.read(bArr3, 0, java.lang.Math.min(length, 4096));
                                                                            if (i2 >= 0) {
                                                                                i6 = 4096;
                                                                                b4 = -31;
                                                                                b3 = -1;
                                                                                break;
                                                                            }
                                                                            eknVar.write(bArr3, 0, i2);
                                                                            length -= i2;
                                                                        } else {
                                                                            b4 = -31;
                                                                            b3 = -1;
                                                                            i6 = 4096;
                                                                            break;
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    ekmVar.b(length - bArr.length);
                                                                    b4 = -31;
                                                                    b3 = -1;
                                                                    i6 = 4096;
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    throw new java.io.IOException("Invalid marker");
                                                } catch (java.lang.Exception e2) {
                                                    e = e2;
                                                    fileInputStream3 = fileInputStream5;
                                                    bufferedInputStream2 = bufferedInputStream3;
                                                    try {
                                                        fileInputStream4 = new java.io.FileInputStream(fileCreateTempFile);
                                                        try {
                                                            str = this.J;
                                                            if (str != null) {
                                                                fileOutputStream2 = new java.io.FileOutputStream(str);
                                                            } else {
                                                                android.system.Os.lseek(this.K, 0L, android.system.OsConstants.SEEK_SET);
                                                                fileOutputStream2 = new java.io.FileOutputStream(this.K);
                                                            }
                                                            defpackage.zb.p(fileInputStream4, fileOutputStream2);
                                                            try {
                                                                mni.bg(fileInputStream4);
                                                                mni.bg(fileOutputStream2);
                                                                throw new java.io.IOException("Failed to save new file", e);
                                                            } catch (java.lang.Throwable th) {
                                                                th = th;
                                                                bufferedInputStream = bufferedInputStream2;
                                                                c3 = c2;
                                                                mni.bg(bufferedInputStream);
                                                                mni.bg(bufferedOutputStream);
                                                                if (c3 == 0) {
                                                                    fileCreateTempFile.delete();
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (java.lang.Exception e3) {
                                                            e = e3;
                                                            fileInputStream3 = fileInputStream4;
                                                            try {
                                                                throw new java.io.IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e);
                                                            } catch (java.lang.Throwable th2) {
                                                                th = th2;
                                                                c4 = 1;
                                                                try {
                                                                    mni.bg(fileInputStream3);
                                                                    mni.bg(fileOutputStream2);
                                                                    throw th;
                                                                } catch (java.lang.Throwable th3) {
                                                                    th = th3;
                                                                    bufferedInputStream = bufferedInputStream2;
                                                                    c3 = c4;
                                                                    mni.bg(bufferedInputStream);
                                                                    mni.bg(bufferedOutputStream);
                                                                    if (c3 == 0) {
                                                                        fileCreateTempFile.delete();
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                        } catch (java.lang.Throwable th4) {
                                                            th = th4;
                                                            fileInputStream3 = fileInputStream4;
                                                            c4 = c2;
                                                            mni.bg(fileInputStream3);
                                                            mni.bg(fileOutputStream2);
                                                            throw th;
                                                        }
                                                    } catch (java.lang.Exception e4) {
                                                        e = e4;
                                                    } catch (java.lang.Throwable th5) {
                                                        th = th5;
                                                    }
                                                } catch (java.lang.Throwable th6) {
                                                    th = th6;
                                                    c3 = c2;
                                                    bufferedInputStream = bufferedInputStream3;
                                                    mni.bg(bufferedInputStream);
                                                    mni.bg(bufferedOutputStream);
                                                    if (c3 == 0) {
                                                        fileCreateTempFile.delete();
                                                    }
                                                    throw th;
                                                }
                                            } else if (i5 == 13) {
                                                if (k) {
                                                    android.util.Log.d("ExifInterface", a.bm((byte) 41, bufferedOutputStream, bufferedInputStream3, "savePngAttributes starting with (inputStream: ", ", outputStream: "));
                                                }
                                                defpackage.ekm ekmVar2 = new defpackage.ekm(bufferedInputStream3);
                                                defpackage.ekn eknVar2 = new defpackage.ekn(bufferedOutputStream, java.nio.ByteOrder.BIG_ENDIAN);
                                                int length4 = s.length;
                                                defpackage.zb.m(ekmVar2, eknVar2, 8);
                                                boolean z2 = this.ab != null || this.ac;
                                                boolean z3 = true;
                                                while (true) {
                                                    if (!z3 && !z2) {
                                                        break;
                                                    }
                                                    int i9 = ekmVar2.readInt();
                                                    int i10 = ekmVar2.readInt();
                                                    c5 = c5;
                                                    if (i10 == 1229472850) {
                                                        eknVar2.b(i9);
                                                        eknVar2.b(1229472850);
                                                        defpackage.zb.m(ekmVar2, eknVar2, i9 + 4);
                                                        if (this.X == 0) {
                                                            z(eknVar2);
                                                            z3 = false;
                                                        }
                                                        if (this.ab != null && !this.ac) {
                                                            A(eknVar2);
                                                            z2 = false;
                                                        }
                                                    } else {
                                                        if (i10 == 1700284774) {
                                                            if (z3) {
                                                                z(eknVar2);
                                                                ekmVar2.b(i9 + 4);
                                                                z3 = false;
                                                            } else {
                                                                i10 = 1700284774;
                                                            }
                                                        }
                                                        if (i10 == 1767135348) {
                                                            byte[] bArr5 = d;
                                                            int length5 = bArr5.length;
                                                            if (i9 >= length5) {
                                                                byte[] bArr6 = new byte[length5];
                                                                ekmVar2.readFully(bArr6);
                                                                int i11 = (i9 - length5) + 4;
                                                                if (java.util.Arrays.equals(bArr6, bArr5)) {
                                                                    if (this.ab != null) {
                                                                        A(eknVar2);
                                                                    }
                                                                    ekmVar2.b(i11);
                                                                    z2 = false;
                                                                } else {
                                                                    eknVar2.b(i9);
                                                                    eknVar2.b(1767135348);
                                                                    eknVar2.write(bArr6);
                                                                    defpackage.zb.m(ekmVar2, eknVar2, i11);
                                                                }
                                                            } else {
                                                                i10 = 1767135348;
                                                            }
                                                        }
                                                        eknVar2.b(i9);
                                                        eknVar2.b(i10);
                                                        defpackage.zb.m(ekmVar2, eknVar2, i9 + 4);
                                                    }
                                                }
                                                defpackage.zb.p(ekmVar2, eknVar2);
                                            } else if (i5 == 14) {
                                                u(bufferedInputStream3, bufferedOutputStream);
                                            }
                                            mni.bg(bufferedInputStream3);
                                            mni.bg(bufferedOutputStream);
                                            fileCreateTempFile.delete();
                                            this.V = null;
                                        } catch (java.lang.Exception e5) {
                                            e = e5;
                                            c2 = 0;
                                        } catch (java.lang.Throwable th7) {
                                            th = th7;
                                            c2 = 0;
                                        }
                                    } catch (java.lang.Exception e6) {
                                        e = e6;
                                        c2 = 0;
                                        bufferedOutputStream = null;
                                    } catch (java.lang.Throwable th8) {
                                        th = th8;
                                        c2 = 0;
                                        bufferedOutputStream = null;
                                        bufferedInputStream = bufferedInputStream3;
                                        c3 = c2;
                                        mni.bg(bufferedInputStream);
                                        mni.bg(bufferedOutputStream);
                                        if (c3 == 0) {
                                            fileCreateTempFile.delete();
                                        }
                                        throw th;
                                    }
                                } catch (java.lang.Exception e7) {
                                    e = e7;
                                    c2 = 0;
                                    bufferedInputStream2 = null;
                                    bufferedOutputStream = null;
                                    fileInputStream3 = fileInputStream5;
                                    fileInputStream4 = new java.io.FileInputStream(fileCreateTempFile);
                                    str = this.J;
                                    if (str != null) {
                                        fileOutputStream2 = new java.io.FileOutputStream(str);
                                    } else {
                                        android.system.Os.lseek(this.K, 0L, android.system.OsConstants.SEEK_SET);
                                        fileOutputStream2 = new java.io.FileOutputStream(this.K);
                                    }
                                    defpackage.zb.p(fileInputStream4, fileOutputStream2);
                                    mni.bg(fileInputStream4);
                                    mni.bg(fileOutputStream2);
                                    throw new java.io.IOException("Failed to save new file", e);
                                }
                            } catch (java.lang.Exception e8) {
                                e = e8;
                                c2 = 0;
                                bufferedInputStream2 = null;
                                fileOutputStream2 = null;
                                bufferedOutputStream = null;
                            }
                        } catch (java.lang.Exception e9) {
                            e = e9;
                            c2 = 0;
                            bufferedInputStream2 = null;
                            fileInputStream3 = null;
                            fileOutputStream2 = null;
                            bufferedOutputStream = null;
                        }
                    } catch (java.lang.Throwable th9) {
                        th = th9;
                        c2 = 0;
                        bufferedInputStream = null;
                        bufferedOutputStream = null;
                    }
                } catch (java.lang.Exception e10) {
                    e = e10;
                    fileInputStream = fileInputStream2;
                    try {
                        throw new java.io.IOException("Failed to copy original file to temp file", e);
                    } catch (java.lang.Throwable th10) {
                        th = th10;
                        mni.bg(fileInputStream);
                        mni.bg(fileOutputStream);
                        throw th;
                    }
                } catch (java.lang.Throwable th11) {
                    th = th11;
                    fileInputStream = fileInputStream2;
                    mni.bg(fileInputStream);
                    mni.bg(fileOutputStream);
                    throw th;
                }
            } catch (java.lang.Exception e11) {
                e = e11;
                fileOutputStream = null;
            } catch (java.lang.Throwable th12) {
                th = th12;
                fileOutputStream = null;
            }
        } catch (java.lang.Exception e12) {
            e = e12;
            fileOutputStream = null;
            fileInputStream = null;
        } catch (java.lang.Throwable th13) {
            th = th13;
            fileOutputStream = null;
            fileInputStream = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    public final byte[] c() throws java.lang.Throwable {
        java.io.FileDescriptor fileDescriptor;
        java.io.InputStream fileInputStream;
        java.io.InputStream inputStream = null;
        if (this.Q) {
            byte[] bArr = this.V;
            if (bArr != null) {
                return bArr;
            }
            try {
                fileInputStream = this.L;
                if (fileInputStream != null) {
                    try {
                        if (fileInputStream.markSupported()) {
                            fileInputStream.reset();
                            fileDescriptor = null;
                            try {
                                try {
                                    defpackage.ekm ekmVar = new defpackage.ekm(fileInputStream);
                                    ekmVar.b(this.T + this.X);
                                    byte[] bArr2 = new byte[this.U];
                                    ekmVar.readFully(bArr2);
                                    this.V = bArr2;
                                    mni.bg(fileInputStream);
                                    if (fileDescriptor != null) {
                                        defpackage.zb.l(fileDescriptor);
                                    }
                                    return bArr2;
                                } catch (java.lang.Exception e2) {
                                    e = e2;
                                    android.util.Log.d("ExifInterface", "Encountered exception while getting thumbnail", e);
                                    mni.bg(fileInputStream);
                                    if (fileDescriptor != null) {
                                        defpackage.zb.l(fileDescriptor);
                                    }
                                    return null;
                                }
                            } catch (java.lang.Throwable th) {
                                th = th;
                                inputStream = fileInputStream;
                                mni.bg(inputStream);
                                if (fileDescriptor != null) {
                                    defpackage.zb.l(fileDescriptor);
                                }
                                throw th;
                            }
                        }
                        android.util.Log.d("ExifInterface", "Cannot read thumbnail from inputstream without mark/reset support");
                        mni.bg(fileInputStream);
                    } catch (java.lang.Exception e3) {
                        e = e3;
                        fileDescriptor = null;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        fileDescriptor = null;
                        inputStream = fileInputStream;
                        mni.bg(inputStream);
                        if (fileDescriptor != null) {
                            defpackage.zb.l(fileDescriptor);
                        }
                        throw th;
                    }
                } else {
                    java.lang.String str = this.J;
                    if (str != null) {
                        fileInputStream = new java.io.FileInputStream(str);
                        fileDescriptor = null;
                        defpackage.ekm ekmVar2 = new defpackage.ekm(fileInputStream);
                        ekmVar2.b(this.T + this.X);
                        byte[] bArr3 = new byte[this.U];
                        ekmVar2.readFully(bArr3);
                        this.V = bArr3;
                        mni.bg(fileInputStream);
                        if (fileDescriptor != null) {
                            defpackage.zb.l(fileDescriptor);
                        }
                        return bArr3;
                    }
                    java.io.FileDescriptor fileDescriptorDup = android.system.Os.dup(this.K);
                    try {
                        android.system.Os.lseek(fileDescriptorDup, 0L, android.system.OsConstants.SEEK_SET);
                        fileDescriptor = fileDescriptorDup;
                        fileInputStream = new java.io.FileInputStream(fileDescriptorDup);
                        defpackage.ekm ekmVar3 = new defpackage.ekm(fileInputStream);
                        ekmVar3.b(this.T + this.X);
                        byte[] bArr4 = new byte[this.U];
                        ekmVar3.readFully(bArr4);
                        this.V = bArr4;
                        mni.bg(fileInputStream);
                        if (fileDescriptor != null) {
                            defpackage.zb.l(fileDescriptor);
                        }
                        return bArr4;
                    } catch (java.lang.Exception e4) {
                        e = e4;
                        fileDescriptor = fileDescriptorDup;
                        fileInputStream = null;
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        fileDescriptor = fileDescriptorDup;
                        mni.bg(inputStream);
                        if (fileDescriptor != null) {
                            defpackage.zb.l(fileDescriptor);
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Exception e5) {
                e = e5;
                fileInputStream = null;
                fileDescriptor = null;
            } catch (java.lang.Throwable th4) {
                th = th4;
                fileDescriptor = null;
            }
            android.util.Log.d("ExifInterface", "Encountered exception while getting thumbnail", e);
            mni.bg(fileInputStream);
            if (fileDescriptor != null) {
                defpackage.zb.l(fileDescriptor);
            }
        }
        return null;
    }

    public final int d() {
        defpackage.eko ekoVarH = h("Orientation");
        if (ekoVarH == null) {
            return 1;
        }
        try {
            return ekoVarH.a(this.P);
        } catch (java.lang.NumberFormatException unused) {
            return 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a4 A[LOOP:8: B:98:0x02a1->B:100:0x02a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:102:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:103:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:105:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:107:0x02de  */
    /* JADX WARN: Code duplicated, block: B:111:0x0301  */
    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    /* JADX WARN: Code duplicated, block: B:64:0x0161 A[PHI: r12
      0x0161: PHI (r12v1 int) = (r12v0 int), (r12v0 int), (r12v0 int), (r12v0 int), (r12v0 int), (r12v19 int) binds: [B:39:0x00cd, B:41:0x00d7, B:49:0x00f3, B:51:0x00f6, B:53:0x00f9, B:48:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0166  */
    /* JADX WARN: Code duplicated, block: B:68:0x016c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0177  */
    /* JADX WARN: Code duplicated, block: B:72:0x0182 A[LOOP:2: B:70:0x017f->B:72:0x0182, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x01c2 A[LOOP:3: B:74:0x01c0->B:75:0x01c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f5 A[LOOP:4: B:79:0x01f2->B:81:0x01f5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x0219 A[LOOP:5: B:83:0x0217->B:84:0x0219, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x0232  */
    /* JADX WARN: Code duplicated, block: B:89:0x023e A[LOOP:6: B:87:0x023b->B:89:0x023e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:92:0x0271  */
    /* JADX WARN: Code duplicated, block: B:95:0x027e A[LOOP:7: B:93:0x027b->B:95:0x027e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x0297  */
    public final void e(java.lang.String str) {
        ahox ahoxVar;
        java.lang.String str2;
        int i2;
        int iIntValue;
        int i3;
        int i4;
        defpackage.eko ekoVar;
        java.lang.String[] strArrSplit;
        int[] iArr;
        int i5;
        java.lang.String[] strArrSplit2;
        long[] jArr;
        int i6;
        int i7;
        java.lang.String[] strArrSplit3;
        defpackage.ekp[] ekpVarArr;
        int i8;
        java.lang.String[] strArrSplit4;
        int length;
        int[] iArr2;
        int i9;
        java.nio.ByteBuffer byteBufferWrap;
        int i10;
        java.lang.String[] strArrSplit5;
        int length2;
        defpackage.ekp[] ekpVarArr2;
        int i11;
        java.nio.ByteBuffer byteBufferWrap2;
        int i12;
        defpackage.ekp ekpVar;
        double d2;
        long j2;
        long j3;
        java.lang.String string = str;
        java.lang.String str3 = "Orientation";
        if (G.contains("Orientation") && !string.contains("/")) {
            try {
                double d3 = java.lang.Double.parseDouble(string);
                long j4 = 1;
                if (d3 >= 9.223372036854776E18d || d3 <= -9.223372036854776E18d) {
                    ekpVar = new defpackage.ekp(d3 > 0.0d ? Long.MAX_VALUE : Long.MIN_VALUE, 1L);
                } else {
                    double dAbs = java.lang.Math.abs(d3);
                    long j5 = 0;
                    long j6 = 1;
                    double d4 = dAbs;
                    long j7 = 0;
                    while (true) {
                        double d5 = d4 % 1.0d;
                        long j8 = (long) (d4 - d5);
                        d2 = d3;
                        j2 = (j8 * j4) + j7;
                        j3 = (j8 * j5) + j6;
                        d4 = 1.0d / d5;
                        long j9 = j4;
                        if (java.lang.Math.abs(dAbs - (j2 / j3)) <= 1.0E-8d * dAbs) {
                            break;
                        }
                        j4 = j2;
                        j7 = j9;
                        d3 = d2;
                        j6 = j5;
                        j5 = j3;
                    }
                    if (d2 < 0.0d) {
                        j2 = -j2;
                    }
                    ekpVar = new defpackage.ekp(j2, j3);
                }
                string = ekpVar.toString();
            } catch (java.lang.NumberFormatException unused) {
                android.util.Log.w("ExifInterface", a.bx(string, "Invalid value for Orientation : "));
                return;
            }
        }
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int length3 = j.length;
            char c2 = '\n';
            if (i14 >= 10) {
                return;
            }
            int i15 = 4;
            if (i14 != 4) {
                ahoxVar = (ahox) F[i14].get(str3);
                if (ahoxVar != null) {
                    android.util.Pair pairG = g(string);
                    iIntValue = ((java.lang.Integer) pairG.first).intValue();
                    i3 = ahoxVar.c;
                    i4 = -1;
                    if (i3 == iIntValue || i3 == ((java.lang.Integer) pairG.second).intValue()) {
                        switch (i3) {
                            case 1:
                                str2 = str3;
                                java.util.HashMap map = this.N[i14];
                                if (string.length() == 1) {
                                    i2 = 0;
                                    if (string.charAt(0) < '0' && string.charAt(0) <= '1') {
                                        ekoVar = new defpackage.eko(1, 1, -1L, new byte[]{(byte) (string.charAt(0) - '0')});
                                    }
                                    map.put(str2, ekoVar);
                                } else {
                                    i2 = 0;
                                }
                                byte[] bytes = string.getBytes(h);
                                ekoVar = new defpackage.eko(1, bytes.length, -1L, bytes);
                                map.put(str2, ekoVar);
                                break;
                            case 2:
                            case 7:
                                str2 = str3;
                                this.N[i14].put(str2, defpackage.eko.c(string));
                                i2 = 0;
                                break;
                            case 3:
                                str2 = str3;
                                strArrSplit = string.split(",", -1);
                                iArr = new int[strArrSplit.length];
                                while (i5 < strArrSplit.length) {
                                    iArr[i5] = java.lang.Integer.parseInt(strArrSplit[i5]);
                                }
                                this.N[i14].put(str2, defpackage.eko.i(iArr, this.P));
                                i2 = 0;
                                break;
                            case 4:
                                str2 = str3;
                                strArrSplit2 = string.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                while (i6 < strArrSplit2.length) {
                                    jArr[i6] = java.lang.Long.parseLong(strArrSplit2[i6]);
                                }
                                this.N[i14].put(str2, defpackage.eko.e(jArr, this.P));
                                i2 = 0;
                                break;
                            case 5:
                                i7 = -1;
                                strArrSplit3 = string.split(",", -1);
                                ekpVarArr = new defpackage.ekp[strArrSplit3.length];
                                i8 = i13;
                                while (i8 < strArrSplit3.length) {
                                    java.lang.String[] strArrSplit6 = strArrSplit3[i8].split("/", i7);
                                    ekpVarArr[i8] = new defpackage.ekp((long) java.lang.Double.parseDouble(strArrSplit6[i13]), (long) java.lang.Double.parseDouble(strArrSplit6[1]));
                                    i8++;
                                    str3 = str3;
                                    i13 = 0;
                                    i7 = -1;
                                }
                                str2 = str3;
                                this.N[i14].put(str2, defpackage.eko.g(ekpVarArr, this.P));
                                i2 = 0;
                                break;
                            case 6:
                            case 8:
                            default:
                                str2 = str3;
                                i2 = i13;
                                if (k) {
                                    android.util.Log.d("ExifInterface", a.bj(i3, "Data format isn't one of expected formats: "));
                                }
                                break;
                            case 9:
                                strArrSplit4 = string.split(",", -1);
                                length = strArrSplit4.length;
                                iArr2 = new int[length];
                                while (i9 < strArrSplit4.length) {
                                    iArr2[i9] = java.lang.Integer.parseInt(strArrSplit4[i9]);
                                }
                                java.util.HashMap map2 = this.N[i14];
                                java.nio.ByteOrder byteOrder = this.P;
                                byteBufferWrap = java.nio.ByteBuffer.wrap(new byte[f[9] * length]);
                                byteBufferWrap.order(byteOrder);
                                while (i10 < length) {
                                    byteBufferWrap.putInt(iArr2[i10]);
                                }
                                map2.put(str3, new defpackage.eko(9, length, -1L, byteBufferWrap.array()));
                                str2 = str3;
                                i2 = i13;
                                break;
                            case 10:
                                strArrSplit5 = string.split(",", -1);
                                length2 = strArrSplit5.length;
                                ekpVarArr2 = new defpackage.ekp[length2];
                                i11 = i13;
                                while (i11 < strArrSplit5.length) {
                                    java.lang.String[] strArrSplit7 = strArrSplit5[i11].split("/", i4);
                                    ekpVarArr2[i11] = new defpackage.ekp((long) java.lang.Double.parseDouble(strArrSplit7[i13]), (long) java.lang.Double.parseDouble(strArrSplit7[1]));
                                    i11++;
                                    c2 = c2;
                                    strArrSplit5 = strArrSplit5;
                                    i4 = -1;
                                }
                                char c3 = c2;
                                java.util.HashMap map3 = this.N[i14];
                                java.nio.ByteOrder byteOrder2 = this.P;
                                byteBufferWrap2 = java.nio.ByteBuffer.wrap(new byte[f[c3] * length2]);
                                byteBufferWrap2.order(byteOrder2);
                                while (i12 < length2) {
                                    defpackage.ekp ekpVar2 = ekpVarArr2[i12];
                                    byteBufferWrap2.putInt((int) ekpVar2.a);
                                    byteBufferWrap2.putInt((int) ekpVar2.b);
                                }
                                map3.put(str3, new defpackage.eko(10, length2, -1L, byteBufferWrap2.array()));
                                str2 = str3;
                                i2 = i13;
                                break;
                        }
                    } else {
                        int i16 = ahoxVar.a;
                        if (i16 == -1 || !(i16 == ((java.lang.Integer) pairG.first).intValue() || i16 == ((java.lang.Integer) pairG.second).intValue())) {
                            if (i3 != 1 && i3 != 7 && i3 != 2) {
                                if (k) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Given tag (Orientation) value didn't match with one of expected formats: ");
                                    java.lang.String[] strArr = e;
                                    sb.append(strArr[i3]);
                                    sb.append(i16 == -1 ? "" : ", ".concat(java.lang.String.valueOf(strArr[i16])));
                                    sb.append(" (guess: ");
                                    sb.append(strArr[((java.lang.Integer) pairG.first).intValue()]);
                                    sb.append(((java.lang.Integer) pairG.second).intValue() != -1 ? ", ".concat(java.lang.String.valueOf(strArr[((java.lang.Integer) pairG.second).intValue()])) : "");
                                    sb.append(')');
                                    android.util.Log.d("ExifInterface", sb.toString());
                                }
                            }
                            str2 = str3;
                            i2 = i13;
                        } else {
                            i3 = i16;
                        }
                        switch (i3) {
                            case 1:
                                str2 = str3;
                                java.util.HashMap map4 = this.N[i14];
                                if (string.length() == 1) {
                                    i2 = 0;
                                    if (string.charAt(0) < '0') {
                                    }
                                    map4.put(str2, ekoVar);
                                } else {
                                    i2 = 0;
                                }
                                byte[] bytes2 = string.getBytes(h);
                                ekoVar = new defpackage.eko(1, bytes2.length, -1L, bytes2);
                                map4.put(str2, ekoVar);
                                break;
                            case 2:
                            case 7:
                                str2 = str3;
                                this.N[i14].put(str2, defpackage.eko.c(string));
                                i2 = 0;
                                break;
                            case 3:
                                str2 = str3;
                                strArrSplit = string.split(",", -1);
                                iArr = new int[strArrSplit.length];
                                for (i5 = 0; i5 < strArrSplit.length; i5++) {
                                    iArr[i5] = java.lang.Integer.parseInt(strArrSplit[i5]);
                                }
                                this.N[i14].put(str2, defpackage.eko.i(iArr, this.P));
                                i2 = 0;
                                break;
                            case 4:
                                str2 = str3;
                                strArrSplit2 = string.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                for (i6 = 0; i6 < strArrSplit2.length; i6++) {
                                    jArr[i6] = java.lang.Long.parseLong(strArrSplit2[i6]);
                                }
                                this.N[i14].put(str2, defpackage.eko.e(jArr, this.P));
                                i2 = 0;
                                break;
                            case 5:
                                i7 = -1;
                                strArrSplit3 = string.split(",", -1);
                                ekpVarArr = new defpackage.ekp[strArrSplit3.length];
                                i8 = i13;
                                while (i8 < strArrSplit3.length) {
                                    java.lang.String[] strArrSplit8 = strArrSplit3[i8].split("/", i7);
                                    ekpVarArr[i8] = new defpackage.ekp((long) java.lang.Double.parseDouble(strArrSplit8[i13]), (long) java.lang.Double.parseDouble(strArrSplit8[1]));
                                    i8++;
                                    str3 = str3;
                                    i13 = 0;
                                    i7 = -1;
                                }
                                str2 = str3;
                                this.N[i14].put(str2, defpackage.eko.g(ekpVarArr, this.P));
                                i2 = 0;
                                break;
                            case 6:
                            case 8:
                            default:
                                str2 = str3;
                                i2 = i13;
                                if (k) {
                                    android.util.Log.d("ExifInterface", a.bj(i3, "Data format isn't one of expected formats: "));
                                }
                                break;
                            case 9:
                                strArrSplit4 = string.split(",", -1);
                                length = strArrSplit4.length;
                                iArr2 = new int[length];
                                for (i9 = i13; i9 < strArrSplit4.length; i9++) {
                                    iArr2[i9] = java.lang.Integer.parseInt(strArrSplit4[i9]);
                                }
                                java.util.HashMap map5 = this.N[i14];
                                java.nio.ByteOrder byteOrder3 = this.P;
                                byteBufferWrap = java.nio.ByteBuffer.wrap(new byte[f[9] * length]);
                                byteBufferWrap.order(byteOrder3);
                                for (i10 = i13; i10 < length; i10++) {
                                    byteBufferWrap.putInt(iArr2[i10]);
                                }
                                map5.put(str3, new defpackage.eko(9, length, -1L, byteBufferWrap.array()));
                                str2 = str3;
                                i2 = i13;
                                break;
                            case 10:
                                strArrSplit5 = string.split(",", -1);
                                length2 = strArrSplit5.length;
                                ekpVarArr2 = new defpackage.ekp[length2];
                                i11 = i13;
                                while (i11 < strArrSplit5.length) {
                                    java.lang.String[] strArrSplit9 = strArrSplit5[i11].split("/", i4);
                                    ekpVarArr2[i11] = new defpackage.ekp((long) java.lang.Double.parseDouble(strArrSplit9[i13]), (long) java.lang.Double.parseDouble(strArrSplit9[1]));
                                    i11++;
                                    c2 = c2;
                                    strArrSplit5 = strArrSplit5;
                                    i4 = -1;
                                }
                                char c4 = c2;
                                java.util.HashMap map6 = this.N[i14];
                                java.nio.ByteOrder byteOrder4 = this.P;
                                byteBufferWrap2 = java.nio.ByteBuffer.wrap(new byte[f[c4] * length2]);
                                byteBufferWrap2.order(byteOrder4);
                                for (i12 = i13; i12 < length2; i12++) {
                                    defpackage.ekp ekpVar3 = ekpVarArr2[i12];
                                    byteBufferWrap2.putInt((int) ekpVar3.a);
                                    byteBufferWrap2.putInt((int) ekpVar3.b);
                                }
                                map6.put(str3, new defpackage.eko(10, length2, -1L, byteBufferWrap2.array()));
                                str2 = str3;
                                i2 = i13;
                                break;
                        }
                    }
                } else {
                    str2 = str3;
                    i2 = i13;
                }
                i15 = i14;
            } else if (this.Q) {
                i14 = 4;
                ahoxVar = (ahox) F[i14].get(str3);
                if (ahoxVar != null) {
                    android.util.Pair pairG2 = g(string);
                    iIntValue = ((java.lang.Integer) pairG2.first).intValue();
                    i3 = ahoxVar.c;
                    i4 = -1;
                    if (i3 == iIntValue) {
                        switch (i3) {
                            case 1:
                                str2 = str3;
                                java.util.HashMap map7 = this.N[i14];
                                if (string.length() == 1) {
                                    i2 = 0;
                                    if (string.charAt(0) < '0') {
                                    }
                                    map7.put(str2, ekoVar);
                                } else {
                                    i2 = 0;
                                }
                                byte[] bytes3 = string.getBytes(h);
                                ekoVar = new defpackage.eko(1, bytes3.length, -1L, bytes3);
                                map7.put(str2, ekoVar);
                                break;
                            case 2:
                            case 7:
                                str2 = str3;
                                this.N[i14].put(str2, defpackage.eko.c(string));
                                i2 = 0;
                                break;
                            case 3:
                                str2 = str3;
                                strArrSplit = string.split(",", -1);
                                iArr = new int[strArrSplit.length];
                                while (i5 < strArrSplit.length) {
                                    iArr[i5] = java.lang.Integer.parseInt(strArrSplit[i5]);
                                }
                                this.N[i14].put(str2, defpackage.eko.i(iArr, this.P));
                                i2 = 0;
                                break;
                            case 4:
                                str2 = str3;
                                strArrSplit2 = string.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                while (i6 < strArrSplit2.length) {
                                    jArr[i6] = java.lang.Long.parseLong(strArrSplit2[i6]);
                                }
                                this.N[i14].put(str2, defpackage.eko.e(jArr, this.P));
                                i2 = 0;
                                break;
                            case 5:
                                i7 = -1;
                                strArrSplit3 = string.split(",", -1);
                                ekpVarArr = new defpackage.ekp[strArrSplit3.length];
                                i8 = i13;
                                while (i8 < strArrSplit3.length) {
                                    java.lang.String[] strArrSplit10 = strArrSplit3[i8].split("/", i7);
                                    ekpVarArr[i8] = new defpackage.ekp((long) java.lang.Double.parseDouble(strArrSplit10[i13]), (long) java.lang.Double.parseDouble(strArrSplit10[1]));
                                    i8++;
                                    str3 = str3;
                                    i13 = 0;
                                    i7 = -1;
                                }
                                str2 = str3;
                                this.N[i14].put(str2, defpackage.eko.g(ekpVarArr, this.P));
                                i2 = 0;
                                break;
                            case 6:
                            case 8:
                            default:
                                str2 = str3;
                                i2 = i13;
                                if (k) {
                                    android.util.Log.d("ExifInterface", a.bj(i3, "Data format isn't one of expected formats: "));
                                }
                                break;
                            case 9:
                                strArrSplit4 = string.split(",", -1);
                                length = strArrSplit4.length;
                                iArr2 = new int[length];
                                while (i9 < strArrSplit4.length) {
                                    iArr2[i9] = java.lang.Integer.parseInt(strArrSplit4[i9]);
                                }
                                java.util.HashMap map8 = this.N[i14];
                                java.nio.ByteOrder byteOrder5 = this.P;
                                byteBufferWrap = java.nio.ByteBuffer.wrap(new byte[f[9] * length]);
                                byteBufferWrap.order(byteOrder5);
                                while (i10 < length) {
                                    byteBufferWrap.putInt(iArr2[i10]);
                                }
                                map8.put(str3, new defpackage.eko(9, length, -1L, byteBufferWrap.array()));
                                str2 = str3;
                                i2 = i13;
                                break;
                            case 10:
                                strArrSplit5 = string.split(",", -1);
                                length2 = strArrSplit5.length;
                                ekpVarArr2 = new defpackage.ekp[length2];
                                i11 = i13;
                                while (i11 < strArrSplit5.length) {
                                    java.lang.String[] strArrSplit11 = strArrSplit5[i11].split("/", i4);
                                    ekpVarArr2[i11] = new defpackage.ekp((long) java.lang.Double.parseDouble(strArrSplit11[i13]), (long) java.lang.Double.parseDouble(strArrSplit11[1]));
                                    i11++;
                                    c2 = c2;
                                    strArrSplit5 = strArrSplit5;
                                    i4 = -1;
                                }
                                char c5 = c2;
                                java.util.HashMap map9 = this.N[i14];
                                java.nio.ByteOrder byteOrder6 = this.P;
                                byteBufferWrap2 = java.nio.ByteBuffer.wrap(new byte[f[c5] * length2]);
                                byteBufferWrap2.order(byteOrder6);
                                while (i12 < length2) {
                                    defpackage.ekp ekpVar4 = ekpVarArr2[i12];
                                    byteBufferWrap2.putInt((int) ekpVar4.a);
                                    byteBufferWrap2.putInt((int) ekpVar4.b);
                                }
                                map9.put(str3, new defpackage.eko(10, length2, -1L, byteBufferWrap2.array()));
                                str2 = str3;
                                i2 = i13;
                                break;
                        }
                    } else {
                        switch (i3) {
                            case 1:
                                str2 = str3;
                                java.util.HashMap map10 = this.N[i14];
                                if (string.length() == 1) {
                                    i2 = 0;
                                    if (string.charAt(0) < '0') {
                                    }
                                    map10.put(str2, ekoVar);
                                } else {
                                    i2 = 0;
                                }
                                byte[] bytes4 = string.getBytes(h);
                                ekoVar = new defpackage.eko(1, bytes4.length, -1L, bytes4);
                                map10.put(str2, ekoVar);
                                break;
                            case 2:
                            case 7:
                                str2 = str3;
                                this.N[i14].put(str2, defpackage.eko.c(string));
                                i2 = 0;
                                break;
                            case 3:
                                str2 = str3;
                                strArrSplit = string.split(",", -1);
                                iArr = new int[strArrSplit.length];
                                while (i5 < strArrSplit.length) {
                                    iArr[i5] = java.lang.Integer.parseInt(strArrSplit[i5]);
                                }
                                this.N[i14].put(str2, defpackage.eko.i(iArr, this.P));
                                i2 = 0;
                                break;
                            case 4:
                                str2 = str3;
                                strArrSplit2 = string.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                while (i6 < strArrSplit2.length) {
                                    jArr[i6] = java.lang.Long.parseLong(strArrSplit2[i6]);
                                }
                                this.N[i14].put(str2, defpackage.eko.e(jArr, this.P));
                                i2 = 0;
                                break;
                            case 5:
                                i7 = -1;
                                strArrSplit3 = string.split(",", -1);
                                ekpVarArr = new defpackage.ekp[strArrSplit3.length];
                                i8 = i13;
                                while (i8 < strArrSplit3.length) {
                                    java.lang.String[] strArrSplit12 = strArrSplit3[i8].split("/", i7);
                                    ekpVarArr[i8] = new defpackage.ekp((long) java.lang.Double.parseDouble(strArrSplit12[i13]), (long) java.lang.Double.parseDouble(strArrSplit12[1]));
                                    i8++;
                                    str3 = str3;
                                    i13 = 0;
                                    i7 = -1;
                                }
                                str2 = str3;
                                this.N[i14].put(str2, defpackage.eko.g(ekpVarArr, this.P));
                                i2 = 0;
                                break;
                            case 6:
                            case 8:
                            default:
                                str2 = str3;
                                i2 = i13;
                                if (k) {
                                    android.util.Log.d("ExifInterface", a.bj(i3, "Data format isn't one of expected formats: "));
                                }
                                break;
                            case 9:
                                strArrSplit4 = string.split(",", -1);
                                length = strArrSplit4.length;
                                iArr2 = new int[length];
                                while (i9 < strArrSplit4.length) {
                                    iArr2[i9] = java.lang.Integer.parseInt(strArrSplit4[i9]);
                                }
                                java.util.HashMap map11 = this.N[i14];
                                java.nio.ByteOrder byteOrder7 = this.P;
                                byteBufferWrap = java.nio.ByteBuffer.wrap(new byte[f[9] * length]);
                                byteBufferWrap.order(byteOrder7);
                                while (i10 < length) {
                                    byteBufferWrap.putInt(iArr2[i10]);
                                }
                                map11.put(str3, new defpackage.eko(9, length, -1L, byteBufferWrap.array()));
                                str2 = str3;
                                i2 = i13;
                                break;
                            case 10:
                                strArrSplit5 = string.split(",", -1);
                                length2 = strArrSplit5.length;
                                ekpVarArr2 = new defpackage.ekp[length2];
                                i11 = i13;
                                while (i11 < strArrSplit5.length) {
                                    java.lang.String[] strArrSplit13 = strArrSplit5[i11].split("/", i4);
                                    ekpVarArr2[i11] = new defpackage.ekp((long) java.lang.Double.parseDouble(strArrSplit13[i13]), (long) java.lang.Double.parseDouble(strArrSplit13[1]));
                                    i11++;
                                    c2 = c2;
                                    strArrSplit5 = strArrSplit5;
                                    i4 = -1;
                                }
                                char c6 = c2;
                                java.util.HashMap map12 = this.N[i14];
                                java.nio.ByteOrder byteOrder8 = this.P;
                                byteBufferWrap2 = java.nio.ByteBuffer.wrap(new byte[f[c6] * length2]);
                                byteBufferWrap2.order(byteOrder8);
                                while (i12 < length2) {
                                    defpackage.ekp ekpVar5 = ekpVarArr2[i12];
                                    byteBufferWrap2.putInt((int) ekpVar5.a);
                                    byteBufferWrap2.putInt((int) ekpVar5.b);
                                }
                                map12.put(str3, new defpackage.eko(10, length2, -1L, byteBufferWrap2.array()));
                                str2 = str3;
                                i2 = i13;
                                break;
                        }
                    }
                } else {
                    str2 = str3;
                    i2 = i13;
                }
                i15 = i14;
            } else {
                str2 = str3;
                i2 = i13;
            }
            i14 = i15 + 1;
            i13 = i2;
            str3 = str2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0040  */
    public ekq(java.io.InputStream inputStream) throws java.lang.Throwable {
        int length = j.length;
        this.N = new java.util.HashMap[10];
        this.O = new java.util.HashSet(10);
        this.P = java.nio.ByteOrder.BIG_ENDIAN;
        java.io.FileDescriptor fd = null;
        this.J = null;
        if (inputStream instanceof android.content.res.AssetManager.AssetInputStream) {
            this.L = (android.content.res.AssetManager.AssetInputStream) inputStream;
            this.K = null;
        } else {
            if (inputStream instanceof java.io.FileInputStream) {
                java.io.FileInputStream fileInputStream = (java.io.FileInputStream) inputStream;
                if (B(fileInputStream.getFD())) {
                    this.L = null;
                    fd = fileInputStream.getFD();
                } else {
                    this.L = null;
                }
            } else {
                this.L = null;
            }
            this.K = fd;
        }
        o(inputStream);
    }
}
