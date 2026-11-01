package com.google.android.setupdesign.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class IllustrationVideoView extends android.view.TextureView implements android.graphics.drawable.Animatable, android.view.TextureView.SurfaceTextureListener, android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnSeekCompleteListener, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnErrorListener {
    protected android.media.MediaPlayer a;
    android.view.Surface b;
    private float c;
    private int d;
    private java.lang.String e;
    private boolean f;
    private boolean g;
    private int h;
    private boolean i;

    public IllustrationVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 1.0f;
        this.d = 0;
        this.g = true;
        this.h = 0;
        this.i = false;
        if (isInEditMode()) {
            return;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.aggy.p);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        if (a.n()) {
            this.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
        }
        typedArrayObtainStyledAttributes.recycle();
        java.lang.String packageName = getContext().getPackageName();
        if (resourceId != this.d || (packageName != null && !packageName.equals(this.e))) {
            this.d = resourceId;
            this.e = packageName;
            a();
        }
        setScaleX(0.9999999f);
        setScaleX(0.9999999f);
        setSurfaceTextureListener(this);
    }

    private final void c() {
        if (getWindowVisibility() == 0) {
            android.view.Surface surface = this.b;
            if (surface != null) {
                surface.release();
                this.b = null;
            }
            android.graphics.SurfaceTexture surfaceTexture = getSurfaceTexture();
            if (surfaceTexture != null) {
                d(true);
                this.b = new android.view.Surface(surfaceTexture);
            }
            if (this.b != null) {
                a();
            } else {
                android.util.Log.i("IllustrationVideoView", "Surface is null");
            }
        }
    }

    private final void d(boolean z) {
        this.i = z;
        setVisibility(this.h);
    }

    protected final void a() {
        android.media.MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        if (this.b == null || this.d == 0) {
            return;
        }
        android.media.MediaPlayer mediaPlayer2 = new android.media.MediaPlayer();
        this.a = mediaPlayer2;
        mediaPlayer2.setSurface(this.b);
        this.a.setOnPreparedListener(this);
        this.a.setOnSeekCompleteListener(this);
        this.a.setOnInfoListener(this);
        this.a.setOnErrorListener(this);
        int i = this.d;
        try {
            this.a.setDataSource(getContext(), android.net.Uri.parse("android.resource://" + this.e + '/' + i), (java.util.Map<java.lang.String, java.lang.String>) null);
            this.a.prepareAsync();
        } catch (java.io.IOException e) {
            android.util.Log.e("IllustrationVideoView", a.bj(i, "Unable to set video data source: "), e);
        }
    }

    public final void b() {
        android.media.MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.a = null;
            this.f = false;
        }
        android.view.Surface surface = this.b;
        if (surface != null) {
            surface.release();
            this.b = null;
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        android.media.MediaPlayer mediaPlayer = this.a;
        return mediaPlayer != null && mediaPlayer.isPlaying();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i2) {
        android.util.Log.w("IllustrationVideoView", a.bf(i2, i, "MediaPlayer error. what=", " extra="));
        return false;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(android.media.MediaPlayer mediaPlayer, int i, int i2) {
        if (i == 3) {
            d(false);
        }
        return false;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        float f = size2;
        float f2 = this.c;
        float f3 = size * f2;
        if (f < f3) {
            size = (int) (f / f2);
        } else {
            size2 = (int) f3;
        }
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(size, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(android.media.MediaPlayer mediaPlayer) {
        float videoHeight;
        this.f = true;
        mediaPlayer.setLooping(true);
        if (mediaPlayer.getVideoWidth() <= 0 || mediaPlayer.getVideoHeight() <= 0) {
            android.util.Log.w("IllustrationVideoView", "Unexpected video size=" + mediaPlayer.getVideoWidth() + 'x' + mediaPlayer.getVideoHeight());
            videoHeight = 0.0f;
        } else {
            videoHeight = mediaPlayer.getVideoHeight() / mediaPlayer.getVideoWidth();
        }
        if (java.lang.Float.compare(this.c, videoHeight) != 0) {
            this.c = videoHeight;
            requestLayout();
        }
        if (getWindowVisibility() == 0) {
            start();
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(android.media.MediaPlayer mediaPlayer) {
        if (this.f) {
            mediaPlayer.start();
        } else {
            android.util.Log.e("IllustrationVideoView", "Seek complete but media player not prepared");
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
        d(true);
        c();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        b();
        return true;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            start();
        } else {
            stop();
        }
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i != 0) {
            b();
        } else if (this.b == null) {
            c();
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        this.h = i;
        if (this.i && i == 0) {
            i = 4;
        }
        super.setVisibility(i);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        android.media.MediaPlayer mediaPlayer;
        if (!this.f || (mediaPlayer = this.a) == null || mediaPlayer.isPlaying()) {
            return;
        }
        this.a.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        android.media.MediaPlayer mediaPlayer;
        if (this.g && this.f && (mediaPlayer = this.a) != null) {
            mediaPlayer.pause();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
